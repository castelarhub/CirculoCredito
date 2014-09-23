package com.maxcom.mpm.client.bi;

import com.maxcom.mpm.client.client.TransaccionCobro;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;

public class CargoOnlineMIT implements CargoOnlineBanco{
        
    public CargoOnlineMIT(){                
    }

    @Override
    public RespuestaBancoTO realizarCargo(TransaccionBancoTO transaccion) throws Exception{        
        RespuestaBancoTO respuestaBanco=null;
        try {
            
            TransaccionCobro clienteCobro = new TransaccionCobro();
            
            respuestaBanco = clienteCobro.realizarPago(transaccion);
            
            clienteCobro = null;
            
        } catch (Exception ex) {
            ex.printStackTrace();
            throw ex;
        }        
        return respuestaBanco;
    }
    
}
