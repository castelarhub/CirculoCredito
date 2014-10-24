package com.maxcom.adaptador.ws;

import com.maxcom.adaptador.client.PagoRentaVOD;
import com.maxcom.adaptador.dto.Payment;
import com.maxcom.adaptador.dto.ResponseRentAssetPayment;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/rentAssetPayment")
public class RentAssetPayment {
    
    static final Logger logger = LogManager.getLogger(RentAssetPayment.class);
    
    @POST    
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public ResponseRentAssetPayment procesar(Payment pago) {
        logger.info("RentAssetPayment:procesar(E)");
        PagoRentaVOD pagoRenta = new PagoRentaVOD();
        ResponseRentAssetPayment respuesta = null;
        try{
            
            if(pago!=null){
                logger.info("getActivationCode:"+pago.getActivationCode()+"*");
                logger.info("getAdultContent:"+pago.getAdultContent()+"*");
                logger.info("getDateEvent:"+pago.getDateEvent()+"*");
                logger.info("getMovieTitle:"+pago.getMovieTitle()+"*");
                logger.info("getPrice:"+pago.getPrice()+"*");
            }else{
                logger.error("Error el pago viene nullo");
            }
            
            respuesta = pagoRenta.enviarPagoRentaVOD(pago);
            
            if(respuesta!=null){
                logger.info("respuesta.getSuccess():"+respuesta.getSuccess()+"*");
                logger.info("respuesta.getMessage():"+respuesta.getMessage()+"*");
            }
            
        }catch(Exception e){            
            logger.error("RentAssetPayment:procesar-Exceptino-"+e.getMessage());
            logger.error(e);
            respuesta = new ResponseRentAssetPayment();            
            respuesta.setSuccess("FALSE");
            respuesta.setMessage("Error en la APP AdaptorMaxcom:RentAssetPayment");
        }finally{
            logger.info("RentAssetPayment:procesar(E)");
        }
        return respuesta;
        
    }   
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String procesar() {
        
        return "No se soporta el metodo get";
        
    }    
}