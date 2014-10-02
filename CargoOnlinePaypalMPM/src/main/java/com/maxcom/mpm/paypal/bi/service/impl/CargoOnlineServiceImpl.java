package com.maxcom.mpm.paypal.bi.service.impl;

import com.maxcom.mpm.paypal.bi.service.CargoOnlineService;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypal;
import com.maxcom.mpm.paypal.client.bi.CargoOnlinePaypalImpl;
import com.maxcom.mpm.paypal.client.dto.ArticuloTO;
import com.maxcom.mpm.paypal.client.dto.PaymentInfoTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaConfirmalPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.RespuestaSolPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionConfirmaPagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionDetallePagoExpressTO;
import com.maxcom.mpm.paypal.client.dto.TransaccionPagoExpressTO;
import com.maxcom.mpm.paypal.dto.CargoTO;
import com.maxcom.mpm.paypal.dto.InformacionPagoTO;
import com.maxcom.mpm.paypal.dto.PayerInfoTO;
import com.maxcom.mpm.paypal.dto.RespuestaConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaDetallePagoTO;
import com.maxcom.mpm.paypal.dto.RespuestaSolicitudTO;
import com.maxcom.mpm.paypal.dto.TransaccionConfirmacionPagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionDetallePagoTO;
import com.maxcom.mpm.paypal.dto.TransaccionSolicitudTO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CargoOnlineServiceImpl implements CargoOnlineService {
    
    public CargoOnlineServiceImpl(){
        
    }
    
    @Override
    public RespuestaSolicitudTO solicitarPago(TransaccionSolicitudTO transaccion) throws Exception{
        
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaSolPagoExpressTO respuestaSol;
        TransaccionPagoExpressTO transaccionPago = new TransaccionPagoExpressTO();
        RespuestaSolicitudTO respuesta = new RespuestaSolicitudTO();
        
        try {
            
            //transaccionPago.setDescripcion("Descipcion general de la orden");
            transaccionPago.setReferencia(transaccion.getReferencia());
            transaccionPago.setUrlCancel(transaccion.getCancelUrl());
            transaccionPago.setUrlReturn(transaccion.getReturnUrl());
            transaccionPago.setReferenciarPago(transaccion.isReferenciarPago());
            
            List <ArticuloTO> lista = new ArrayList<>();
            ArticuloTO articulo;
            
            //Detalle
            for(CargoTO cargoAux : transaccion.getCargos()){
                articulo = new ArticuloTO();
                articulo.setCantidad(cargoAux.getCantidad());
                articulo.setDescripcion(cargoAux.getDescripcion());
                articulo.setPrecio(cargoAux.getPrecio());
                
                lista.add(articulo);
            }
            
            transaccionPago.setListaArticulos(lista);
            
            respuestaSol = cargo.solicitarPagoExpress(transaccionPago);
            
            respuesta.setDetalleError(null);
            respuesta.setFecha(Calendar.getInstance().getTime());
            respuesta.setFechaHora(respuestaSol.getFechaHora());
            respuesta.setIdCargoOnline(transaccion.getIdOrden());
            respuesta.setIdEstatus(respuestaSol.getAck());
            respuesta.setIdOperacion(respuestaSol.getCorrelationID());
            respuesta.setIdTransaccion(transaccion.getIdTransaccion());
            respuesta.setMontoTotal("0.0");
            respuesta.setObservaciones("Transaccion procesada.");
            respuesta.setRespuesta("RTRAN");
            respuesta.setToken(respuestaSol.getToken());
            
            //Pendiente si respuestaConfirmacion.getListaErrores() trae errores

        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
        
        return respuesta;
    }
    
    @Override
    public RespuestaDetallePagoTO recuperarDetallePago(TransaccionDetallePagoTO transaccion) throws Exception {
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaDetallePagoExpressTO respuestaSol;
        TransaccionDetallePagoExpressTO trasaccionDetalle = new TransaccionDetallePagoExpressTO();
        RespuestaDetallePagoTO respuesta = new RespuestaDetallePagoTO();
        
        try {
            
            trasaccionDetalle.setReferencia(transaccion.getReferencia());
            trasaccionDetalle.setToken(transaccion.getToken());
            
            respuestaSol = cargo.recuperaDetallePagoExpress(trasaccionDetalle);
            
            PayerInfoTO infoCliente = new PayerInfoTO();
            if(respuestaSol.getPayerInfo()!=null){
                infoCliente.setCalle(respuestaSol.getPayerInfo().getCalle());
                infoCliente.setCiudad(respuestaSol.getPayerInfo().getCiudad());
                infoCliente.setCodigoPostal(respuestaSol.getPayerInfo().getCodigoPostal());
                infoCliente.setCuenta(respuestaSol.getPayerInfo().getPayer());
                infoCliente.setEntidadFederativa(respuestaSol.getPayerInfo().getEstado());
                infoCliente.setEstatus(respuestaSol.getPayerInfo().getPayerStatus());
                infoCliente.setNombre(respuestaSol.getPayerInfo().getPayerName());
                infoCliente.setPais(respuestaSol.getPayerInfo().getPais());
                infoCliente.setPayerID(respuestaSol.getPayerInfo().getPayerID());
                infoCliente.setTelefono(respuestaSol.getPayerInfo().getTelefono());
            }
            
            List<CargoTO> cargos = new ArrayList<>();
            if(respuestaSol.getListItem()!=null){
                CargoTO cargoAux = null;
                for(ArticuloTO articulo :respuestaSol.getListItem()){
                    cargoAux = new CargoTO();
                    cargoAux.setCantidad(articulo.getCantidad());
                    cargoAux.setDescripcion(articulo.getDescripcion());
                    cargoAux.setPrecio(articulo.getPrecio());
                    cargos.add(cargoAux);
                }
            }
            
            respuesta.setCargos(cargos);
            respuesta.setFecha(Calendar.getInstance().getTime());
            respuesta.setFechaHora(respuestaSol.getFechaHora());
            respuesta.setIdCargoOnline(transaccion.getIdOrden());
            respuesta.setIdEstatus(respuestaSol.getAck());
            respuesta.setIdOperacion(respuestaSol.getCorrelationID());
            respuesta.setIdTransaccion(transaccion.getIdTransaccion());
            respuesta.setInfoCliente(infoCliente);
            respuesta.setObservaciones("Transaccion procesada.");
            respuesta.setOrderTotal(respuestaSol.getOrderTotal());
            respuesta.setRespuesta("RTRAN");
            respuesta.setToken(respuestaSol.getToken());
            //Para pagos referenciados
            respuesta.setTieneAcuerdoPagoReferenciado(respuestaSol.isTieneAcuerdoReferenciado());
            
            //Pendiente si respuestaConfirmacion.getListaErrores() trae errores

        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
        
        return respuesta;
    }

    @Override
    public RespuestaConfirmacionPagoTO confirmarPago(TransaccionConfirmacionPagoTO transaccion) throws Exception {
        CargoOnlinePaypal cargo = new CargoOnlinePaypalImpl();
        RespuestaConfirmalPagoExpressTO respuestaConfirmacion;
        TransaccionConfirmaPagoExpressTO trasaccionConfirma = new TransaccionConfirmaPagoExpressTO();
        RespuestaConfirmacionPagoTO respuesta = new RespuestaConfirmacionPagoTO();
        
        try {
            
            trasaccionConfirma.setReferencia(transaccion.getReferencia());
            trasaccionConfirma.setToken(transaccion.getToken());
            trasaccionConfirma.setPayerId(transaccion.getPayerId());
            trasaccionConfirma.setOrderTotal(transaccion.getOrderTotal());
            trasaccionConfirma.setItemTotal(transaccion.getOrderTotal());//Revisar si se puede omitir el itemTotal
            
            respuestaConfirmacion = cargo.confirmarPagoExpress(trasaccionConfirma);
            
            PaymentInfoTO infoPagoRespuesta = respuestaConfirmacion.getInformacionPago();
            InformacionPagoTO informacionPago = new InformacionPagoTO();
            if(infoPagoRespuesta!=null){
                informacionPago.setFeeAmount(infoPagoRespuesta.getFeeAmount());
                informacionPago.setGrossAmount(infoPagoRespuesta.getGrossAmount());
                informacionPago.setPaymentDate(infoPagoRespuesta.getPaymentDate());
                informacionPago.setPaymentStatus(infoPagoRespuesta.getPaymentStatus());
                informacionPago.setPaymentType(infoPagoRespuesta.getPaymentType());
                informacionPago.setTransactionID(infoPagoRespuesta.getTransactionID());
                informacionPago.setTransactionType(infoPagoRespuesta.getTransactionType());
            }
            
            respuesta.setInformacionPago(informacionPago);
            respuesta.setFecha(Calendar.getInstance().getTime());
            respuesta.setFechaHora(respuestaConfirmacion.getFechaHora());
            respuesta.setIdCargoOnline(transaccion.getIdOrden());
            respuesta.setIdEstatus(respuestaConfirmacion.getAck());
            respuesta.setIdOperacion(respuestaConfirmacion.getCorrelationID());
            respuesta.setIdTransaccion(transaccion.getIdTransaccion());
            respuesta.setObservaciones("Transaccion procesada.");
            respuesta.setRespuesta("RTRAN");
            respuesta.setToken(respuestaConfirmacion.getToken());
            
            //Para los pagos referenciados
            respuesta.setBillingAgreementId(respuestaConfirmacion.getBillingAgreementId());
            
            //Pendiente si respuestaConfirmacion.getListaErrores() trae errores

        } catch (Exception e) {
            //e.printStackTrace();
            throw e;
        }
        
        return respuesta;
    }
    
}
