package com.maxcom.mpm.client.bi;

import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;

public interface CargoOnlineBanco {
    public RespuestaBancoTO realizarCargo(TransaccionBancoTO transaccion);
}