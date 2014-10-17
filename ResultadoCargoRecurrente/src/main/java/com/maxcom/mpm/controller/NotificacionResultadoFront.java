package com.maxcom.mpm.controller;

import com.maxcom.mpm.client.Cargo;
import com.maxcom.mpm.client.Respuesta;
import com.maxcom.mpm.client.RespuestaService;
import com.maxcom.mpm.client.Transaccion;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;

public class NotificacionResultadoFront{

    public RespuestaTO notificar(TransaccionTO transaccion) {
        
        RespuestaService cargoRecurrente = new RespuestaService();
        RespuestaTO resp = new RespuestaTO();
        
        if(transaccion == null ){
            
            resp.setAcuseSap("-");
            resp.setIdCobranza(0);
            resp.setIdEstatus("ERROR");
            resp.setObservaciones("Se requiere una transaccion valida.");

            return resp;            
            
        }
        
        Transaccion transaccionRC = new Transaccion();
        transaccionRC.setIdCobranza(transaccion.getIdCobranza());
        
        Cargo cargoAux = null;
        
        if(transaccion.getListaCargosAceptados() != null){        
            for(CargoTO cargoX:transaccion.getListaCargosAceptados()){

                cargoAux = new Cargo();
                cargoAux.setCuenta(cargoX.getCuenta());
                cargoAux.setDescripcionRespuesta(cargoX.getDescripcionRespuesta());
                cargoAux.setEmail(cargoX.getEmail());
                cargoAux.setEntidadFinanciera(true);
                cargoAux.setIdCobranzaDetalle(cargoX.getIdCobranzaDetalle());
                cargoAux.setIdRespuestaCargo(cargoX.getIdRespuestaCargo());
                cargoAux.setImporte(cargoX.getImporte());
                cargoAux.setMarcaTarjeta(cargoX.getMarcaTarjeta());
                cargoAux.setNombreCliente(cargoX.getNombreCliente());
                cargoAux.setReferencia(cargoX.getReferencia());
                cargoAux.setTipoCuenta(cargoX.getTipoCuenta());

                transaccionRC.getListaCargosAceptados().add(cargoAux);
            }
        }
        
        if(transaccion.getListaCargosRechazados() != null){
            for(CargoTO cargoX:transaccion.getListaCargosRechazados()){

                cargoAux = new Cargo();
                cargoAux.setCuenta(cargoX.getCuenta());
                cargoAux.setDescripcionRespuesta(cargoX.getDescripcionRespuesta());
                cargoAux.setEmail(cargoX.getEmail());
                cargoAux.setEntidadFinanciera(true);
                cargoAux.setIdCobranzaDetalle(cargoX.getIdCobranzaDetalle());
                cargoAux.setIdRespuestaCargo(cargoX.getIdRespuestaCargo());
                cargoAux.setImporte(cargoX.getImporte());
                cargoAux.setMarcaTarjeta(cargoX.getMarcaTarjeta());
                cargoAux.setNombreCliente(cargoX.getNombreCliente());
                cargoAux.setReferencia(cargoX.getReferencia());
                cargoAux.setTipoCuenta(cargoX.getTipoCuenta());

                transaccionRC.getListaCargosRechazados().add(cargoAux);
            }
        }
        
        
        
        Respuesta respuesta = 
                cargoRecurrente.getRespuestaCargoRecurrentePort().procesarCargos(transaccionRC);
                                        
        
        resp.setAcuseSap(respuesta.getAcuseSap());
        resp.setIdCobranza(respuesta.getIdCobranza());
        resp.setIdEstatus(respuesta.getIdEstatus());
        resp.setObservaciones(respuesta.getObservaciones());
        
        return resp;
    }
    
}
