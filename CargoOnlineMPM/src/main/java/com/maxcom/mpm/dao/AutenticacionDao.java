/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.dao;

import com.maxcom.mpm.model.MpmCusersWs;

/**
 *
 * @author operador
 */
public interface AutenticacionDao {
    
   public boolean isAutenticacionValida(MpmCusersWs usuario) throws Exception;
   
}
