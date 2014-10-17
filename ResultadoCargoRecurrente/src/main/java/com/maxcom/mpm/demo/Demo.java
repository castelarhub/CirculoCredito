package com.maxcom.mpm.demo;


import com.maxcom.mpm.controller.NotificacionResultadoFront;
import com.maxcom.mpm.dto.CargoTO;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    
    public static void main(String ...args){
        NotificacionResultadoFront notificacion = new NotificacionResultadoFront();
        
        List<CargoTO> listaCargosAceptados = new ArrayList<CargoTO>();
        List<CargoTO> listaCargosRechazados = new ArrayList<CargoTO>();
        
        CargoTO cargo = new CargoTO();
        cargo.setCuenta("123456789012345");
        cargo.setDescripcionRespuesta("Cargo procesado");
        cargo.setEmail("nelson.castelar@gmail.com");
        cargo.setEntidadFinanciera(true);
        cargo.setIdCobranzaDetalle(1);
        cargo.setIdRespuestaCargo("00");
        cargo.setImporte(25.90);
        cargo.setMarcaTarjeta(2);
        cargo.setNombreCliente("Nelson Castelar Montiel");
        cargo.setReferencia("REF-PRUEBA-002");
        cargo.setTipoCuenta(2);
        
        
        listaCargosAceptados.add(cargo);
        
        cargo = new CargoTO();
        cargo.setCuenta("923456789012345");
        cargo.setDescripcionRespuesta("Cargo procesado, LA TARJETA NO EXISTE");
        cargo.setEmail("nelson.castelar@gmail.com");
        cargo.setEntidadFinanciera(true);
        cargo.setIdCobranzaDetalle(1);
        cargo.setIdRespuestaCargo("50");
        cargo.setImporte(5.50);
        cargo.setMarcaTarjeta(2);
        cargo.setNombreCliente("FULANO PEREZ GARCIA");
        cargo.setReferencia("REF-PRUEBA-003");
        cargo.setTipoCuenta(2);        
        
        listaCargosRechazados.add(cargo);
        
        TransaccionTO ejemplo = new TransaccionTO();
        ejemplo.setIdCobranza(2);
        ejemplo.setListaCargosAceptados(listaCargosAceptados);
        ejemplo.setListaCargosRechazados(listaCargosRechazados);
        
        
        RespuestaTO respuesta = notificacion.notificar(ejemplo);
        
        System.out.print("respuesta.getObservaciones():"+respuesta.getObservaciones()+"*");
        
        
    }
    

}
