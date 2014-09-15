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
            pagoSolicitado.setCodigoSeguridadTarjeta("9920");
            pagoSolicitado.setMesExpiracionTarjeta("08");
            pagoSolicitado.setMonto(1.20);
            pagoSolicitado.setNombreCliente("Nelson Ca Mo");
            pagoSolicitado.setNumeroTarjeta("5275010903634968");
            pagoSolicitado.setReferencia("99020");

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
