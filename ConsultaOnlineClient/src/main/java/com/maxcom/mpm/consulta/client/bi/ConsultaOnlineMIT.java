package com.maxcom.mpm.consulta.client.bi;

import com.maxcom.mpm.consulta.client.client.ConsultaTransaccionOnline;
import com.maxcom.mpm.consulta.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.consulta.client.dto.TransaccionBancoTO;
import java.util.List;

public class ConsultaOnlineMIT implements ConsultaOnlineBanco {    
    
    /**
     * Valida si existe un cargo con la informacion enviada, si existe, regresa el cargo.
     * @param transaccion
     * @return
     * @throws Exception 
     */
    @Override
    public RespuestaBancoTO consultarCargo(TransaccionBancoTO transaccion) throws Exception {
        RespuestaBancoTO respuestaConsulta = null;
        List<RespuestaBancoTO> listRespuestaConsulta;
        
        ConsultaTransaccionOnline consultaTransaccion = new ConsultaTransaccionOnline();
        listRespuestaConsulta = consultaTransaccion.consultarCargos(transaccion);
        
        //Solo se recupera el primer cargo encontrado
        if(listRespuestaConsulta!=null && listRespuestaConsulta.size()>0){
            respuestaConsulta = listRespuestaConsulta.get(0);
        }
        
        return respuestaConsulta;
    }
    
}
