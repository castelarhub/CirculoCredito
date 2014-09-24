package com.maxcom.mpm.consulta.client.demo;

import com.maxcom.mpm.consulta.client.bi.ConsultaOnlineBanco;
import com.maxcom.mpm.consulta.client.bi.ConsultaOnlineMIT;
import com.maxcom.mpm.consulta.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.consulta.client.dto.TransaccionBancoTO;
import com.maxcom.mpm.consulta.client.mapping.RespuestaMIT;
import com.mit.client.Xmltransacciones;
import java.io.StringReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {
    
    public static void main_11(String arg[]) throws Exception{
        Xmltransacciones obj = new Xmltransacciones();
        
        String usuario = "D234CWUS2";
        String password="B37A515E3974FA04CB";
        String idCompany="D234";
        String fecha="18/09/2014";
        String branch="002";
        String referencia="REF-18092014-021";
                
        String salida = 
               obj.getXmltransaccionesHttpPort().transacciones(usuario, 
                                                               password, 
                                                               idCompany, 
                                                               fecha, 
                                                               branch, 
                                                               referencia);       
        
        salida = "<respuestaMIT>"+salida+"</respuestaMIT>";
        
        //String salida = "<respuestaMIT><transacciones><transaccion><nu_operaion>000450775</nu_operaion><cd_usuario>D234CWUS1</cd_usuario><cd_empresa>D234</cd_empresa><nu_sucursal>002</nu_sucursal><nu_afiliacion>7465892</nu_afiliacion><nb_referencia>REF-18092014-023</nb_referencia><cc_nombre>MARCOS VAZQUEZ</cc_nombre><cc_num>4968</cc_num><cc_tp>MasterCard</cc_tp><nu_importe>35000</nu_importe><cd_tipopago>Contado</cd_tipopago><cd_tipocobro>Moto</cd_tipocobro><cd_instrumento>Credito</cd_instrumento><nb_response>denied</nb_response><nu_auth></nu_auth><fh_registro>18/09/2014 17:17</fh_registro><fh_bank>18/09/2014</fh_bank><cd_usrtransaccion></cd_usrtransaccion><tp_operacion>VENTA</tp_operacion><nb_currency>MXN</nb_currency><cd_resp>41</cd_resp><nb_resp>Tarjeta extraviada</nb_resp></transaccion><transaccion><nu_operaion>000450723</nu_operaion><cd_usuario>D234CWUS1</cd_usuario><cd_empresa>D234</cd_empresa><nu_sucursal>002</nu_sucursal><nu_afiliacion>7465892</nu_afiliacion><nb_referencia>REF-18092014-021</nb_referencia><cc_nombre>MARCOS VAZQUEZ</cc_nombre><cc_num>4968</cc_num><cc_tp>MasterCard</cc_tp><nu_importe>10.05</nu_importe><cd_tipopago>Contado</cd_tipopago><cd_tipocobro>Moto</cd_tipocobro><cd_instrumento>Credito</cd_instrumento><nb_response>approved</nb_response><nu_auth>551445</nu_auth><fh_registro>18/09/2014 14:29</fh_registro><fh_bank>18/09/2014</fh_bank><cd_usrtransaccion></cd_usrtransaccion><tp_operacion>VENTA</tp_operacion><nb_currency>MXN</nb_currency><cd_resp></cd_resp><nb_resp></nb_resp></transaccion><transaccion><nu_operaion>000450722</nu_operaion><cd_usuario>D234CWUS1</cd_usuario><cd_empresa>D234</cd_empresa><nu_sucursal>002</nu_sucursal><nu_afiliacion>7465892</nu_afiliacion><nb_referencia>REF-18092014-020</nb_referencia><cc_nombre>Nelson Castelar Mon</cc_nombre><cc_num>4968</cc_num><cc_tp>MasterCard</cc_tp><nu_importe>1.02</nu_importe><cd_tipopago>Contado</cd_tipopago><cd_tipocobro>Moto</cd_tipocobro><cd_instrumento>Credito</cd_instrumento><nb_response>approved</nb_response><nu_auth>605986</nu_auth><fh_registro>18/09/2014 14:24</fh_registro><fh_bank>18/09/2014</fh_bank><cd_usrtransaccion></cd_usrtransaccion><tp_operacion>VENTA</tp_operacion><nb_currency>MXN</nb_currency><cd_resp></cd_resp><nb_resp></nb_resp></transaccion><transaccion><nu_operaion>000450695</nu_operaion><cd_usuario>D234CWUS1</cd_usuario><cd_empresa>D234</cd_empresa><nu_sucursal>002</nu_sucursal><nu_afiliacion>7465892</nu_afiliacion><nb_referencia>REF-18092014-011</nb_referencia><cc_nombre>Nelson Castelar Mon</cc_nombre><cc_num>4968</cc_num><cc_tp>MasterCard</cc_tp><nu_importe>1.02</nu_importe><cd_tipopago>Contado</cd_tipopago><cd_tipocobro>Moto</cd_tipocobro><cd_instrumento>Credito</cd_instrumento><nb_response>approved</nb_response><nu_auth>005433</nu_auth><fh_registro>18/09/2014 13:16</fh_registro><fh_bank>18/09/2014</fh_bank><cd_usrtransaccion></cd_usrtransaccion><tp_operacion>VENTA</tp_operacion><nb_currency>MXN</nb_currency><cd_resp></cd_resp><nb_resp></nb_resp></transaccion><transaccion><nu_operaion>000450694</nu_operaion><cd_usuario>D234CWUS1</cd_usuario><cd_empresa>D234</cd_empresa><nu_sucursal>002</nu_sucursal><nu_afiliacion>7465892</nu_afiliacion><nb_referencia>REF-18092014-010</nb_referencia><cc_nombre>Nelson Castelar Mon</cc_nombre><cc_num>4968</cc_num><cc_tp>MasterCard</cc_tp><nu_importe>1.01</nu_importe><cd_tipopago>Contado</cd_tipopago><cd_tipocobro>Moto</cd_tipocobro><cd_instrumento>Credito</cd_instrumento><nb_response>approved</nb_response><nu_auth>133621</nu_auth><fh_registro>18/09/2014 13:08</fh_registro><fh_bank>18/09/2014</fh_bank><cd_usrtransaccion></cd_usrtransaccion><tp_operacion>VENTA</tp_operacion><nb_currency>MXN</nb_currency><cd_resp></cd_resp><nb_resp></nb_resp></transaccion></transacciones></respuestaMIT>";
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(salida);
        
        StringReader sr = new StringReader(salida);
        JAXBContext context2 = JAXBContext.newInstance(RespuestaMIT.class);
        Unmarshaller u = context2.createUnmarshaller ();
        RespuestaMIT reponseMIT =(RespuestaMIT) u.unmarshal(sr);
        
        System.out.println(reponseMIT);
        
    }
    
    public static void main(String arg[]) throws Exception{
        ConsultaOnlineBanco consulta = new ConsultaOnlineMIT();
        TransaccionBancoTO transaccion = new TransaccionBancoTO();
        transaccion.setFechaCargo("18/09/2014");
        transaccion.setReferencia("REF-18092014-021");
        
        RespuestaBancoTO respuesta = consulta.consultarCargo(transaccion);
        
        if(respuesta!=null){        
            System.out.println("Nb_response:"+respuesta.getNb_response());
            System.out.println("Nu_operaion:"+respuesta.getNu_operaion());        
            System.out.println("Nu_auth:"+respuesta.getNu_auth());
            System.out.println("Cc_nombre:"+respuesta.getCc_nombre());
            System.out.println("Nb_referencia:"+respuesta.getNb_referencia());
            System.out.println("Nb_resp:"+respuesta.getNb_resp());        
        }else{
            System.err.println("No se encontro el cargo buscado");
        }
        
        
    }
}