package com.maxcom.mpm.client.demo;

import com.maxcom.mpm.client.bi.CargoOnlineBanco;
import com.maxcom.mpm.client.bi.CargoOnlineMIT;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
    
    private static final Logger LOGGER = LogManager.getLogger(Test.class);
    private static final double MONTO = 2.09;
    
    private Test(){
    }
    
    public static void main(String []args) {
        LOGGER.info("Test:main(E)");
        
        LOGGER.info("args[]:"+args[0]);
        
        CargoOnlineBanco cargoOnline = new CargoOnlineMIT();
        TransaccionBancoTO pagoSolicitado = new TransaccionBancoTO();

        try {
            
            pagoSolicitado.setAnioExpiracionTarjeta("15");
            pagoSolicitado.setCodigoSeguridadTarjeta("123");
            pagoSolicitado.setMesExpiracionTarjeta("08");
            pagoSolicitado.setMonto(MONTO);
            pagoSolicitado.setNombreCliente("Nelson Amex PruebaXYZ");
            pagoSolicitado.setNumeroTarjeta("370314551252452");
            pagoSolicitado.setReferencia("99052");

            //
            RespuestaBancoTO respuestaBanco = cargoOnline.realizarCargo(pagoSolicitado);
            LOGGER.info("Respuesta:" + respuestaBanco.getResponse());
            LOGGER.info("Referencia:" + respuestaBanco.getReference());
            LOGGER.info("Autorizacion:" + respuestaBanco.getAuth());
            LOGGER.info("Amount:" + respuestaBanco.getAmount());
            LOGGER.info("FolioCPagos:" + respuestaBanco.getFoliocpagos());

        } catch (Exception e) {
            LOGGER.error("Exception", e);
        }finally{
            LOGGER.info("Test:main(S)");
        }
        

    }

}
