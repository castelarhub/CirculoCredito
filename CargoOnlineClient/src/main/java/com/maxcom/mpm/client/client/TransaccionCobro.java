package com.maxcom.mpm.client.client;

import com.maxcom.mpm.client.util.Constantes;
import static com.maxcom.mpm.client.util.Utilerias.getEncryptedString;
import static com.maxcom.mpm.client.util.Utilerias.getLinearizationXML;
import com.maxcom.mpm.client.mapping.Business;
import com.maxcom.mpm.client.mapping.CreditCard;
import com.maxcom.mpm.client.mapping.Payment;
import com.maxcom.mpm.client.mapping.ResponseCenterOfPayment;
import com.maxcom.mpm.client.mapping.Transacction;
import com.maxcom.mpm.client.dto.RespuestaBancoTO;
import com.maxcom.mpm.client.dto.TransaccionBancoTO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import java.io.StringReader;
import java.io.StringWriter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TransaccionCobro {
    
    public RespuestaBancoTO realizarPago(TransaccionBancoTO transaccion) throws JAXBException{
        RespuestaBancoTO respuestaBancoTO= null;
        
        Payment pago = formarPago(transaccion);
        
        String xmlPago = getPagoEnXml(pago);
        
        String respuestaMitXml = enviarPago(xmlPago);
        
        ResponseCenterOfPayment repuestaMit = formarRespuestaPago(respuestaMitXml);
        
        //Mapeando respuesta
        respuestaBancoTO = new RespuestaBancoTO();
        
        respuestaBancoTO.setSolicitudXml(xmlPago);
        respuestaBancoTO.setRespuestaXml(getLinearizationXML(respuestaMitXml));
        
        //Numero de referencia
        respuestaBancoTO.setReference(repuestaMit.getReference());
        respuestaBancoTO.setResponse(repuestaMit.getResponse());
        respuestaBancoTO.setAmount(repuestaMit.getAmount());
        //No. de Autorizacion
        respuestaBancoTO.setAuth(repuestaMit.getAuth());
        respuestaBancoTO.setCdError(repuestaMit.getCdError());
        respuestaBancoTO.setCdResponse(repuestaMit.getCdResponse());
        respuestaBancoTO.setNbError(repuestaMit.getNbError());
        //No. de Operacion
        respuestaBancoTO.setFoliocpagos(repuestaMit.getFoliocpagos());
        //Nombre del TH
        respuestaBancoTO.setCcName(repuestaMit.getCcName());
        //Ultimos 4 digitos de la tarjetas
        respuestaBancoTO.setCcNumber(repuestaMit.getCcNumber());
        respuestaBancoTO.setFriendlyResponse(repuestaMit.getFriendlyResponse());
        
        return respuestaBancoTO;
    }
    
    private Payment formarPago(TransaccionBancoTO entrada){
        Payment pago = new Payment();
        
        Business negocio = new Business();
        negocio.setIdCompany(Constantes.ID_COMPANY);
        negocio.setIdBranch(Constantes.ID_BRANCH);
        negocio.setCountry(Constantes.COUNTRY);        
        negocio.setUser(Constantes.USER);
        //Datos encriptados
        negocio.setPwd(getEncryptedString(Constantes.PWD));
        
        CreditCard tarjeta = new CreditCard();
        tarjeta.setCrypto(Constantes.CRYPTO);
        
        //De acuerdo al tipo de tarjeta
        if(entrada.getTipoTarjeta().equals(Constantes.TYPE_AMEX)){
            tarjeta.setType(Constantes.TYPE_AMEX);
        }else{
            tarjeta.setType(Constantes.TYPE_V_MC);
        }
        
        
        //Datos encriptados
        tarjeta.setName(getEncryptedString(entrada.getNombreCliente()));
        tarjeta.setNumber(getEncryptedString(entrada.getNumeroTarjeta()));
        tarjeta.setExpmonth(getEncryptedString(entrada.getMesExpiracionTarjeta()));
        tarjeta.setExpyear(getEncryptedString(entrada.getAnioExpiracionTarjeta()));
        tarjeta.setCvvCsc(getEncryptedString(entrada.getCodigoSeguridadTarjeta()));
                
        Transacction transaccion = new Transacction();
        
        //De acuerdo al tipo de tarjeta
        if(entrada.getTipoTarjeta().equals(Constantes.TYPE_AMEX)){
            transaccion.setMerchant(Constantes.MERCHANT_AMEX);
        }else{
            transaccion.setMerchant(Constantes.MERCHANT_V_MC);
        }
        
        transaccion.setReference(entrada.getReferencia());
        transaccion.setTpOperation(Constantes.TP_OPERACION);
        transaccion.setTarjeta(tarjeta);
        transaccion.setAmount(String.valueOf(entrada.getMonto()));
        transaccion.setCurrency(Constantes.CURRENCY);
        
        pago.setNegocio(negocio);
        pago.setTransaccion(transaccion);
        
        return pago;
    }
    
    private String getPagoEnXml(Payment pago) throws JAXBException{
        JAXBContext context = JAXBContext.newInstance(Payment.class);
        
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        
        StringWriter sw = new StringWriter();
        m.marshal(pago, sw);
        
        return getLinearizationXML(sw.toString());
        
    }
    
    private ResponseCenterOfPayment formarRespuestaPago(String respuestaXML) throws JAXBException{
        StringReader sr = new StringReader(respuestaXML);
        ResponseCenterOfPayment reponse = null;
        
        JAXBContext context2 = JAXBContext.newInstance(ResponseCenterOfPayment.class);
        Unmarshaller u = context2.createUnmarshaller ();
        reponse =(ResponseCenterOfPayment) u.unmarshal(sr);
        
        return reponse;
    }
    
    private String enviarPago(String xmlPago) throws JAXBException{
        String textEntity =  null;
        Client client = Client.create();
        WebResource webResource = client.resource(Constantes.URL_COBRO);
        
        MultivaluedMap formData = new MultivaluedMapImpl();
        formData.add("xml", xmlPago);
        ClientResponse response = webResource.accept(MediaType.APPLICATION_XML).
                                  type(MediaType.APPLICATION_FORM_URLENCODED_TYPE).
                                  post(ClientResponse.class, formData);
        textEntity = response.getEntity(String.class);
        
        return textEntity;
        
    }
}
