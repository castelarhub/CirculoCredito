package com.maxcom.mpm.consulta.client.client;

import com.maxcom.mpm.consulta.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.consulta.client.dto.TransaccionBancoTO;
import com.maxcom.mpm.consulta.client.mapping.RespuestaMIT;
import com.maxcom.mpm.consulta.client.mapping.Transaccion;
import com.maxcom.mpm.consulta.client.util.Constantes;
import com.mit.client.Xmltransacciones;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ConsultaTransaccionOnline {
    
    public RespuestaBancoTO consultarCargo(TransaccionBancoTO transaccion) throws Exception{
        
        RespuestaBancoTO respuestaBancoTO = null;
        Xmltransacciones obj = new Xmltransacciones();
        
        String response = 
               obj.getXmltransaccionesHttpPort().transacciones(Constantes.USUARIO_CONSULTA, 
                                                               Constantes.PWD_CONSULTA, 
                                                               Constantes.ID_COMPANY, 
                                                               transaccion.getFechaCargo(), 
                                                               Constantes.ID_BRANCH, 
                                                               transaccion.getReferencia());
        
        response = "<respuestaMIT>"+response+"</respuestaMIT>";
        
        StringReader sr = new StringReader(response);
        JAXBContext context2 = JAXBContext.newInstance(RespuestaMIT.class);
        Unmarshaller u = context2.createUnmarshaller ();
        RespuestaMIT reponseMIT =(RespuestaMIT) u.unmarshal(sr);
        
        if(reponseMIT.getTransacciones()!=null && reponseMIT.getTransacciones().getTransacciones()!=null){
            
            for(Transaccion tranAux: reponseMIT.getTransacciones().getTransacciones()){
                tranAux.getCd_resp();
            }
            
        }
        reponseMIT.getTransacciones().getTransacciones()
        
        
        return respuestaBancoTO;
    }
    
}
