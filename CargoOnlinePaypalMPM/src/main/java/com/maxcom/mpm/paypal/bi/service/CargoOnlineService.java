package com.maxcom.mpm.paypal.bi.service;

import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;

public interface CargoOnlineService {
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion) throws Exception;
}
