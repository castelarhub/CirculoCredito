package com.maxcom.adaptador.client;

import com.maxcom.adaptador.dto.Payment;
import com.maxcom.adaptador.dto.ResponseRentAssetPayment;
import com.maxcom.legacy_portal_maxcom.bart.aioeventstorating.DTAIOEventsToRatingCC;
import com.maxcom.legacy_portal_maxcom.bart.aioeventstorating.DTAIOeventstoratingCCResponse;
import com.maxcom.legacy_portal_maxcom.bart.aioeventstorating.SOSAIOEventsToRatingCC;
import com.maxcom.legacy_portal_maxcom.bart.aioeventstorating.SOSAIOEventsToRatingCCService;
import java.math.BigDecimal;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author Nelson Castelar
 */
public class PagoRentaVOD {
    
    public ResponseRentAssetPayment enviarPagoRentaVOD(Payment pago) throws Exception{
        
        SOSAIOEventsToRatingCCService service = new SOSAIOEventsToRatingCCService();
        
        SOSAIOEventsToRatingCC port = service.getHTTP_Port();
        
        ((BindingProvider) port).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "msalcido");
        ((BindingProvider) port).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "P3kas008*");
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://procorc.maxcom.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BS_PORTAL_MAXCOM_DEV&receiverParty=&receiverService=&interface=SOS_AIOEventsToRatingCC&interfaceNamespace=http://maxcom.com/LEGACY_PORTAL_MAXCOM/BART/AIOeventstorating");
        
        DTAIOEventsToRatingCC Aio = new DTAIOEventsToRatingCC();
        
        DTAIOEventsToRatingCC.ChargeableItemReq solicitudCargo = new DTAIOEventsToRatingCC.ChargeableItemReq();
        
        DTAIOEventsToRatingCC.ChargeableItemReq.Property propiedad =  null;
        
        
        solicitudCargo.setUsername(pago.getActivationCode().toUpperCase());
        
        //Agregando titulo
        propiedad =  new DTAIOEventsToRatingCC.ChargeableItemReq.Property();
        propiedad.setName("TITLE");
        propiedad.setTitle(pago.getMovieTitle().toUpperCase());
        solicitudCargo.getProperty().add(propiedad);
        
        //Agregando precio
        propiedad =  new DTAIOEventsToRatingCC.ChargeableItemReq.Property();
        propiedad.setName("PRICE");
        propiedad.setPrice(new BigDecimal(pago.getPrice()));
        solicitudCargo.getProperty().add(propiedad);
    
        propiedad =  new DTAIOEventsToRatingCC.ChargeableItemReq.Property();
        propiedad.setName("ADULT_CONTENT");
        propiedad.setAdultContent(pago.getAdultContent().toUpperCase());
        solicitudCargo.getProperty().add(propiedad);
        
        Aio.setChargeableItemReq(solicitudCargo);
        
        DTAIOeventstoratingCCResponse respuesta = null;
        
        respuesta = port.sosAIOEventsToRatingCC(Aio);
        
        String message = respuesta.getChargeableItemChargeResponse().getMessage();
        String allow = respuesta.getChargeableItemChargeResponse().getAllow();
        
        ResponseRentAssetPayment respuestaCargo = new ResponseRentAssetPayment();
        respuestaCargo.setSuccess(allow);
        respuestaCargo.setMessage(message);
        
        return respuestaCargo;
    }
    
    
    public static void main(String[] args) throws Exception   {
        SOSAIOEventsToRatingCCService service = new SOSAIOEventsToRatingCCService();

        SOSAIOEventsToRatingCC port = service.getHTTP_Port();

        ((BindingProvider) port).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "msalcido");
        ((BindingProvider) port).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "P3kas008*");
        ((BindingProvider) port).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://procorc.maxcom.com:50000/XISOAPAdapter/MessageServlet?senderParty=&senderService=BS_PORTAL_MAXCOM_DEV&receiverParty=&receiverService=&interface=SOS_AIOEventsToRatingCC&interfaceNamespace=http://maxcom.com/LEGACY_PORTAL_MAXCOM/BART/AIOeventstorating");

        DTAIOEventsToRatingCC Aio = new DTAIOEventsToRatingCC();
        
        DTAIOEventsToRatingCC.ChargeableItemReq item = new DTAIOEventsToRatingCC.ChargeableItemReq();
        
        DTAIOEventsToRatingCC.ChargeableItemReq.Property p1 = new DTAIOEventsToRatingCC.ChargeableItemReq.Property();
        
        //p1.setPrice(new BigDecimal(2));
        item.setUsername("2222");
        p1.setName("TITLE");
        p1.setTitle("PELI 01");
        /*
        p1.setAdultContent("AA");
        item.setUsername("AAAA");
        */
        item.getProperty().add(p1);
        
        DTAIOEventsToRatingCC.ChargeableItemReq.Property propiedad =  new DTAIOEventsToRatingCC.ChargeableItemReq.Property();
        propiedad.setName("PRICE");
        propiedad.setPrice(new BigDecimal(2));
        
        item.getProperty().add(propiedad);    
    
        propiedad =  new DTAIOEventsToRatingCC.ChargeableItemReq.Property();
        propiedad.setName("ADULT_CONTENT");
        propiedad.setAdultContent("true");
        item.getProperty().add(propiedad);
        
        Aio.setChargeableItemReq(item);
        
        DTAIOeventstoratingCCResponse respuesta = null;
        
        respuesta = port.sosAIOEventsToRatingCC(Aio);
        
        String message = respuesta.getChargeableItemChargeResponse().getMessage();
        String allow = respuesta.getChargeableItemChargeResponse().getAllow();
        
        System.out.println("message:["+message+"]");
        System.out.println("allow:["+allow+"]");
        
    }    
}
