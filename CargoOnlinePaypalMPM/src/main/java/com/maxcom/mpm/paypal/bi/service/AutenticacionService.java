package com.maxcom.mpm.paypal.bi.service;

import com.maxcom.mpm.paypal.dto.AutenticacionTO;

/**
 *
 * @author operador
 */
public interface AutenticacionService {
    public boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception;;
}
