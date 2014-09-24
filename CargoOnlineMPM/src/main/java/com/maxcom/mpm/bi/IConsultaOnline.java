package com.maxcom.mpm.bi;

import com.maxcom.mpm.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.dto.ConsultaTransaccionTO;

public interface IConsultaOnline {
    
    public ConsultaRespuestaTO consultar(ConsultaTransaccionTO transaccion);
    
}
