package com.maxcom.mpm.consulta.client.dto;

public class TransaccionBancoTO {
    
    private String fechaCargo;
    private String referencia;

    /**
     * @return the fechaCargo
     */
    public String getFechaCargo() {
        return fechaCargo;
    }

    /**
     * @param fechaCargo the fechaCargo to set
     */
    public void setFechaCargo(String fechaCargo) {
        this.fechaCargo = fechaCargo;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
}
