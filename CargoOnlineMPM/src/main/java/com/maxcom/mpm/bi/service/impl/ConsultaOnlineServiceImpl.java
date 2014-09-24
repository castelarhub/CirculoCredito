package com.maxcom.mpm.bi.service.impl;

import com.maxcom.mpm.bi.service.ConsultaOnlineService;
import com.maxcom.mpm.consulta.client.bi.ConsultaOnlineBanco;
import com.maxcom.mpm.consulta.client.bi.ConsultaOnlineMIT;
import com.maxcom.mpm.consulta.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.consulta.client.dto.TransaccionBancoTO;
import com.maxcom.mpm.dto.ConsultaCargoTO;
import com.maxcom.mpm.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.dto.ConsultaTransaccionTO;
import java.util.Calendar;


public class ConsultaOnlineServiceImpl implements ConsultaOnlineService{

    ConsultaOnlineBanco consultaOnline = null;
    TransaccionBancoTO transaccionBanco = null;
    
    public ConsultaOnlineServiceImpl(){        
        consultaOnline = new ConsultaOnlineMIT();
        transaccionBanco = new TransaccionBancoTO();
    }    
    
    @Override
    public ConsultaRespuestaTO consultarCargo(ConsultaTransaccionTO transaccion) throws Exception {
        ConsultaCargoTO cargo = transaccion.getCargo();
        ConsultaRespuestaTO respuesta = null;
        StringBuilder observaciones = new StringBuilder("");

        //Mapeando valores
        transaccionBanco.setFechaCargo(cargo.getFechaCargo());
        transaccionBanco.setReferencia(cargo.getReferencia());

        //Realizando pago
        RespuestaBancoTO respuestaBanco = consultaOnline.consultarCargo(transaccionBanco);        

        //Si es nulo, entonces no se encontro el cargo solicitado
        if (respuestaBanco != null) {
            
            String resultadoBanco = respuestaBanco.getNb_response().toUpperCase();
            String resultadoWS = null;

            //Analizando respuesta
            switch (resultadoBanco) {
                case "APPROVED":
                    resultadoWS = "APROBADA";//Transacción aprobada por el banco emisor. 
                    observaciones.append("Transaccion procesada. Cargo aprobado.");
                    break;
                case "DENIED":
                    resultadoWS = "RECHAZADA";//Transacción rechazada por el banco emisor. 
                    observaciones.append("Transaccion procesada. Cargo rechazado. ");
                    /*observaciones.append(" Nb_error: ");
                     observaciones.append(respuestaBanco.getNb_error());
                     observaciones.append(" - ");
                     observaciones.append(" cd_error: ");
                     observaciones.append(respuestaBanco.getCd_error());
                     observaciones.append(" - ");
                     observaciones.append(" cd_response: ");
                     observaciones.append(respuestaBanco.getCd_response());
                     observaciones.append(" - ");
                     observaciones.append(" f_response: ");
                     observaciones.append(respuestaBanco.getFriendly_response());*/
                    break;
                case "ERROR":
                    resultadoWS = "ERROR";//Error en la información proporcionada al solicitar el servicio web.
                    observaciones.append("Transaccion procesada. Cargo con Error. ");
                    /*observaciones.append(" Nb_error: ");
                     observaciones.append(respuestaBanco.getNb_error());                
                     observaciones.append(" - ");
                     observaciones.append(" cd_error: ");
                     observaciones.append(respuestaBanco.getCd_error());
                     observaciones.append(" - ");
                     observaciones.append(" cd_response: ");
                     observaciones.append(respuestaBanco.getCd_response());                
                     observaciones.append(" - ");                
                     observaciones.append(" f_response: ");
                     observaciones.append(respuestaBanco.getFriendly_response());*/
                    break;
                default:
                    observaciones.append("Transaccion procesada. Error, estatus del cargo desconocido.");
                    resultadoWS = "DESCONOCIDA";
            }
            
            respuesta = new ConsultaRespuestaTO(transaccion.getIdOrden(), "RTRAN",
                    observaciones.toString(),
                    Calendar.getInstance().getTime(),
                    null, resultadoWS, 
                    respuestaBanco.getNb_referencia(), 
                    respuestaBanco.getNu_auth(), 
                    respuestaBanco.getNu_importe());
            
            respuesta.setBanCdRespuesta(respuestaBanco.getCd_resp());
            respuesta.setBanNbRespuesta(respuestaBanco.getNb_response());
            respuesta.setBanNumeroOperacion(respuestaBanco.getNu_operaion());
            //respuesta.setRespuestaXml(respuestaBanco.getRespuesta_xml());

        } else {
            
            observaciones.append("Transaccion procesada. No se encontro el cargo. ");
            
            respuesta = new ConsultaRespuestaTO(transaccion.getIdOrden(), "RTRAN",
                    observaciones.toString(),
                    Calendar.getInstance().getTime(),
                    null, null, 
                    null, 
                    null, 
                    null);
        }
        
        return respuesta;        
    }
    
}
