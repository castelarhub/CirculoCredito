/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.bi.service;

import com.maxcom.mpm.dto.ConsultaRespuestaTO;
import com.maxcom.mpm.dto.ConsultaTransaccionTO;


/**
 *
 * @author operador
 */
public interface ConsultaOnlineService {
    public ConsultaRespuestaTO consultarCargo(ConsultaTransaccionTO transaccion) throws Exception;
}
