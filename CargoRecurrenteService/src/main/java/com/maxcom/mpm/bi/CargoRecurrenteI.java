/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.bi;

import com.maxcom.mpm.dto.RespuestaTO;
import com.maxcom.mpm.dto.TransaccionTO;

/**
 *
 * @author Nelson C.
 */
public interface CargoRecurrenteI {
    
    public RespuestaTO procesar(TransaccionTO transaccion);
    
}
