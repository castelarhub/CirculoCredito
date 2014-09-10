package com.maxcom.mpm.bi.service;

import com.maxcom.mpm.dto.AutenticacionTO;

/**
 *
 * @author operador
 */
public interface AutenticacionService {
    public boolean isAutenticacionValida(AutenticacionTO autenticacion) throws Exception;;
}
