/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.bi.service;

import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;

/**
 *
 * @author operador
 */
public interface CargoOnlineService {
    public RespuestaTO procesarCargo(TransaccionTO transaccion) throws Exception;
}
