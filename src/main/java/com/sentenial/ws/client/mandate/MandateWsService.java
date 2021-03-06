
package com.sentenial.ws.client.mandate;

import com.sentenial.ws.service.WsSettingsLoader;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MandateWsService", targetNamespace = "urn:com:sentenial:origix:ws:mandate-ws:wsdl", wsdlLocation = "file:/C:/Users/christian.reichel/AppData/Local/Temp/tempdir2986468521781568418.tmp/mandate-ws_1.wsdl")
public class MandateWsService
    extends Service
{

    private final static URL MANDATEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException MANDATEWSSERVICE_EXCEPTION;
    private final static QName MANDATEWSSERVICE_QNAME = new QName("urn:com:sentenial:origix:ws:mandate-ws:wsdl", "MandateWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = WsSettingsLoader.getClassLoader().getResource("com/sentenial/origix/ws/mandate/mandate-ws.wsdl");
        } catch (Exception ex) {
            e = new WebServiceException(ex);
        }
        MANDATEWSSERVICE_WSDL_LOCATION = url;
        MANDATEWSSERVICE_EXCEPTION = e;
    }

    public MandateWsService() {
        super(__getWsdlLocation(), MANDATEWSSERVICE_QNAME);
    }

    public MandateWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MANDATEWSSERVICE_QNAME, features);
    }

    public MandateWsService(URL wsdlLocation) {
        super(wsdlLocation, MANDATEWSSERVICE_QNAME);
    }

    public MandateWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MANDATEWSSERVICE_QNAME, features);
    }

    public MandateWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MandateWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MandateWs
     */
    @WebEndpoint(name = "MandateWsSoap11")
    public MandateWs getMandateWsSoap11() {
        return super.getPort(new QName("urn:com:sentenial:origix:ws:mandate-ws:wsdl", "MandateWsSoap11"), MandateWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MandateWs
     */
    @WebEndpoint(name = "MandateWsSoap11")
    public MandateWs getMandateWsSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("urn:com:sentenial:origix:ws:mandate-ws:wsdl", "MandateWsSoap11"), MandateWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MANDATEWSSERVICE_EXCEPTION!= null) {
            throw MANDATEWSSERVICE_EXCEPTION;
        }
        return MANDATEWSSERVICE_WSDL_LOCATION;
    }

}
