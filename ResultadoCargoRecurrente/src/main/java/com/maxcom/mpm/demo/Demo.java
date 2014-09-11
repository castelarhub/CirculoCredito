package com.maxcom.mpm.demo;

import com.maxcom.mpm.controller.NotificacionResultadoFront;
import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;

public class Demo {
    
    public static void main(String ...args){
        NotificacionResultadoFront notificacion = new NotificacionResultadoFront();
        RespuestaTO respuesta = notificacion.notificar(new TransaccionTO());
        System.out.print("OK.");
        
    }
    

}
