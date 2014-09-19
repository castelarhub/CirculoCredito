package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.CargoOnlineService;
import com.maxcom.mpm.client.bi.CargoOnlineBanco;
import com.maxcom.mpm.client.bi.CargoOnlineMIT;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import java.util.Calendar;

public class CargoOnlineServiceImpl implements CargoOnlineService {
    
    CargoOnlineBanco cargoOnline = null;
    TransaccionBancoTO transaccionBanco = null;
    
    public CargoOnlineServiceImpl(){        
        cargoOnline = new CargoOnlineMIT();
        transaccionBanco = new TransaccionBancoTO();
    }

    @Override
    public RespuestaTO procesarCargo(TransaccionTO transaccion) throws Exception{
        CargoTO cargo = transaccion.getCargo();
        RespuestaTO respuesta = null;
        StringBuilder observaciones = new StringBuilder("");
        
        //Mapeando valores
        this.transaccionBanco.setReferencia(cargo.getReferencia());
        this.transaccionBanco.setNombreCliente(cargo.getNombreCliente());
        this.transaccionBanco.setNumeroTarjeta(cargo.getNumeroTarjeta());
        this.transaccionBanco.setMesExpiracionTarjeta(cargo.getMesExpiracionTarjeta());
        this.transaccionBanco.setAnioExpiracionTarjeta(cargo.getAnioExpiracionTarjeta());
        this.transaccionBanco.setCodigoSeguridadTarjeta(cargo.getCodigoSeguridadTarjeta());
        this.transaccionBanco.setMonto(cargo.getMonto());
        
        //Realizando pago
        RespuestaBancoTO respuestaBanco = cargoOnline.realizarCargo(transaccionBanco);
        
        String resultadoBanco = respuestaBanco.getResponse().toUpperCase();
        String resultadoWS=null;
        
        //Analizando respuesta
        switch(resultadoBanco){
            case "APPROVED":
                resultadoWS = "APROBADA";//Transacción aprobada por el banco emisor. 
                observaciones.append("Transaccion procesada. Cargo aprobado.");
                break;
            case "DENIED":
                resultadoWS = "RECHAZADA";//Transacción rechazada por el banco emisor. 
                observaciones.append("Transaccion procesada. Cargo rechazado. ");
                observaciones.append(" Nb_error: ");
                observaciones.append(respuestaBanco.getNb_error());
                observaciones.append(" - ");
                observaciones.append(" cd_error: ");
                observaciones.append(respuestaBanco.getCd_error());
                observaciones.append(" - ");
                observaciones.append(" cd_response: ");
                observaciones.append(respuestaBanco.getCd_response());
                observaciones.append(" - ");                
                observaciones.append(" f_response: ");
                observaciones.append(respuestaBanco.getFriendly_response());
                break;
            case "ERROR":
                resultadoWS = "ERROR";//Error en la información proporcionada al solicitar el servicio web.
                observaciones.append("Transaccion procesada. Cargo con Error. ");
                observaciones.append(" Nb_error: ");
                observaciones.append(respuestaBanco.getNb_error());                
                observaciones.append(" - ");
                observaciones.append(" cd_error: ");
                observaciones.append(respuestaBanco.getCd_error());
                observaciones.append(" - ");
                observaciones.append(" cd_response: ");
                observaciones.append(respuestaBanco.getCd_response());                
                observaciones.append(" - ");                
                observaciones.append(" f_response: ");
                observaciones.append(respuestaBanco.getFriendly_response());                
                break;
            default: 
                observaciones.append("Transaccion procesada. Error, estatus del cargo desconocido.");
                resultadoWS = "DESCONOCIDA";
        }
        
        respuesta = new RespuestaTO(transaccion.getIdOrden(), transaccion.getIdTransaccion(),
                "RTRAN", observaciones.toString(),
                Calendar.getInstance().getTime(), null);
        
        respuesta.setReferencia(respuestaBanco.getReference());
        respuesta.setAutorizacion(respuestaBanco.getAuth());
        respuesta.setMonto(respuestaBanco.getAmount());
        respuesta.setRespuesta(resultadoWS);
        respuesta.setFolioCPagos(respuestaBanco.getFoliocpagos());
        
        respuesta.setBanCdError(respuestaBanco.getCd_error());
        respuesta.setBanCdResponse(respuestaBanco.getCd_response());
        respuesta.setBanNbError(respuestaBanco.getNb_error());
                
        respuesta.setSolicitudXml(respuestaBanco.getSolicitud_xml());
        respuesta.setRespuestaXml(respuestaBanco.getRespuesta_xml());
        
        return respuesta;
    }
    
}
