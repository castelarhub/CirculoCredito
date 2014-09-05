/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.castelar.ejemplosMaven;


import org.apache.log4j.Logger;
/**
 *
 * @author operador
 */
public class HelloWorld {
    
    static Logger log = Logger.getLogger(HelloWorld.class.getName());
    
    public static void main(String []args){
        log.info("Inicia");
        log.info("Hello world!!");
        log.debug("Hello world debug!!");
        log.debug("Hello world debug222!!");
        log.error("error");
        log.info("Termina ok");
    }
    
}
