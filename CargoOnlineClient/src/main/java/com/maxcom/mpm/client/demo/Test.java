package com.maxcom.mpm.client.demo;

import com.maxcom.mpm.client.bi.CargoOnlineBanco;
import com.maxcom.mpm.client.bi.CargoOnlineMIT;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;

public class Test {

    public static void main(String args[]) {
        CargoOnlineBanco cargoOnline = new CargoOnlineMIT();
        TransaccionBancoTO pagoSolicitado = new TransaccionBancoTO();

        try {

            pagoSolicitado.setAnioExpiracionTarjeta("15");
            pagoSolicitado.setCodigoSeguridadTarjeta("123");
            pagoSolicitado.setMesExpiracionTarjeta("08");
            pagoSolicitado.setMonto(2.09);
            pagoSolicitado.setNombreCliente("Nelson Amex PruebaXYZ");
            pagoSolicitado.setNumeroTarjeta("370314551252452");
            pagoSolicitado.setReferencia("99052");

            //
            RespuestaBancoTO respuestaBanco = cargoOnline.realizarCargo(pagoSolicitado);

            System.out.println("Respuesta:" + respuestaBanco.getResponse());
            System.out.println("Referencia:" + respuestaBanco.getReference());
            System.out.println("Autorizacion:" + respuestaBanco.getAuth());
            System.out.println("Amount:" + respuestaBanco.getAmount());
            System.out.println("FolioCPagos:" + respuestaBanco.getFoliocpagos());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
