package com.maxcom.mpm.consulta.client.client;

import com.maxcom.mpm.consulta.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.consulta.client.dto.TransaccionBancoTO;
import com.maxcom.mpm.consulta.client.mapping.RespuestaMIT;
import com.maxcom.mpm.consulta.client.mapping.Transaccion;
import com.maxcom.mpm.consulta.client.util.Constantes;
import static com.maxcom.mpm.consulta.client.util.Utilerias.getEncryptedString;
import com.mit.client.Xmltransacciones;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class ConsultaTransaccionOnline {
    
    public List<RespuestaBancoTO> consultarCargos(TransaccionBancoTO transaccion) throws Exception{
        List<RespuestaBancoTO> listRespuestaBancoTO;
        Xmltransacciones obj = new Xmltransacciones();
        
        String response = 
               obj.getXmltransaccionesHttpPort().transacciones(Constantes.USUARIO_CONSULTA, 
                                                               getEncryptedString(Constantes.PWD_CONSULTA), 
                                                               Constantes.ID_COMPANY, 
                                                               transaccion.getFechaCargo(), 
                                                               Constantes.ID_BRANCH, 
                                                               transaccion.getReferencia());        
        
        response = "<respuestaMIT>"+response+"</respuestaMIT>";
        
        StringReader sr = new StringReader(response);
        JAXBContext context2 = JAXBContext.newInstance(RespuestaMIT.class);
        Unmarshaller u = context2.createUnmarshaller ();
        RespuestaMIT reponseMIT =(RespuestaMIT) u.unmarshal(sr);
        
        listRespuestaBancoTO = mapearRespuesta(reponseMIT,response);
        
        return listRespuestaBancoTO;
    }
    
    private List<RespuestaBancoTO> mapearRespuesta(RespuestaMIT respuestaMIT, String respuestaGeneral) {
        
        List<RespuestaBancoTO> listRespuestaBancoTO = new ArrayList<RespuestaBancoTO>();
        RespuestaBancoTO respuestaBancoTO;

        if (respuestaMIT.getTransacciones() != null && 
            respuestaMIT.getTransacciones().getTransacciones() != null) {
            for (Transaccion transaccionMIT : respuestaMIT.getTransacciones().getTransacciones()) {
                
                respuestaBancoTO = new RespuestaBancoTO();

                respuestaBancoTO.setCc_nombre(transaccionMIT.getCc_nombre());
                respuestaBancoTO.setCc_num(transaccionMIT.getCc_num());
                respuestaBancoTO.setCc_tp(transaccionMIT.getCc_tp());
                respuestaBancoTO.setCd_empresa(transaccionMIT.getCd_empresa());
                respuestaBancoTO.setCd_instrumento(transaccionMIT.getCd_instrumento());
                respuestaBancoTO.setCd_resp(transaccionMIT.getCd_resp());
                respuestaBancoTO.setCd_tipocobro(transaccionMIT.getCd_tipocobro());
                respuestaBancoTO.setCd_tipopago(transaccionMIT.getCd_tipopago());
                respuestaBancoTO.setCd_usrtransaccion(transaccionMIT.getCd_usrtransaccion());
                respuestaBancoTO.setCd_usuario(transaccionMIT.getCd_usuario());
                respuestaBancoTO.setFh_bank(transaccionMIT.getFh_bank());
                respuestaBancoTO.setFh_registro(transaccionMIT.getFh_registro());
                respuestaBancoTO.setNb_currency(transaccionMIT.getNb_currency());
                respuestaBancoTO.setNb_referencia(transaccionMIT.getNb_referencia());
                respuestaBancoTO.setNb_resp(transaccionMIT.getNb_resp());
                respuestaBancoTO.setNb_response(transaccionMIT.getNb_response());
                respuestaBancoTO.setNu_afiliacion(transaccionMIT.getNu_afiliacion());
                respuestaBancoTO.setNu_auth(transaccionMIT.getNu_auth());
                respuestaBancoTO.setNu_importe(transaccionMIT.getNu_importe());
                respuestaBancoTO.setNu_operaion(transaccionMIT.getNu_operaion());
                respuestaBancoTO.setNu_sucursal(transaccionMIT.getNu_sucursal());
                respuestaBancoTO.setTp_operacion(transaccionMIT.getTp_operacion());
                
                listRespuestaBancoTO.add(respuestaBancoTO);
            }
        }
        
        return listRespuestaBancoTO;
    }
    
}
