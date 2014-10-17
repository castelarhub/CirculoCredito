/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.maxcom.mpm.respuesta.dto;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author operador
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaccion")
public class TransaccionTO {
    
    private long idCobranza;
    private List<CargoTO> listaCargosAceptados;
    private List<CargoTO> listaCargosRechazados;

    /**
     * @return the idCobranza
     */
    public long getIdCobranza() {
        return idCobranza;
    }

    /**
     * @param idCobranza the idCobranza to set
     */
    public void setIdCobranza(long idCobranza) {
        this.idCobranza = idCobranza;
    }

    /**
     * @return the listaCargosAceptados
     */
    public List<CargoTO> getListaCargosAceptados() {
        return listaCargosAceptados;
    }

    /**
     * @param listaCargosAceptados the listaCargosAceptados to set
     */
    public void setListaCargosAceptados(List<CargoTO> listaCargosAceptados) {
        this.listaCargosAceptados = listaCargosAceptados;
    }

    /**
     * @return the listaCargosRechazados
     */
    public List<CargoTO> getListaCargosRechazados() {
        return listaCargosRechazados;
    }

    /**
     * @param listaCargosRechazados the listaCargosRechazados to set
     */
    public void setListaCargosRechazados(List<CargoTO> listaCargosRechazados) {
        this.listaCargosRechazados = listaCargosRechazados;
    }
    
}
