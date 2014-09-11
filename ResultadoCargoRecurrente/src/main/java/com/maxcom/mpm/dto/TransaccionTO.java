package com.maxcom.mpm.dto;

import java.util.List;

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
