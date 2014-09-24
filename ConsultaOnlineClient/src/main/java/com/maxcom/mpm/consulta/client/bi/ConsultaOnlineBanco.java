package com.maxcom.mpm.consulta.client.bi;

import com.maxcom.mpm.consulta.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.consulta.client.dto.TransaccionBancoTO;

public interface ConsultaOnlineBanco {
        public RespuestaBancoTO consultarCargo(TransaccionBancoTO transaccion) throws Exception;
}
