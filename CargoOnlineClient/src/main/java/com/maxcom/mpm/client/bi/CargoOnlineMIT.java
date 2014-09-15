package com.maxcom.mpm.client.bi;

import com.maxcom.mpm.client.client.TransaccionCobro;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;

public class CargoOnlineMIT implements CargoOnlineBanco{
    
    TransaccionCobro clienteCobro = null;
    
    public CargoOnlineMIT(){        
        clienteCobro = new TransaccionCobro();
    }

    @Override
    public RespuestaBancoTO realizarCargo(TransaccionBancoTO transaccion) throws Exception{        
        RespuestaBancoTO respuestaBanco=null;
        try {
            respuestaBanco = clienteCobro.realizarPago(transaccion);
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }        
        return respuestaBanco;
    }
    
}
