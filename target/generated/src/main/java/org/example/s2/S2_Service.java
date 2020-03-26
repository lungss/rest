package org.example.s2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2020-03-26T16:35:03.622+08:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "s2",
                  wsdlLocation = "file:/C:/Users/SHYHSHENLUNG/codeready-workspace/rest/src/main/resources/wsdl/s2.wsdl",
                  targetNamespace = "http://www.example.org/s2/")
public class S2_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.example.org/s2/", "s2");
    public final static QName S2SOAP = new QName("http://www.example.org/s2/", "s2SOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/SHYHSHENLUNG/codeready-workspace/rest/src/main/resources/wsdl/s2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(S2_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/SHYHSHENLUNG/codeready-workspace/rest/src/main/resources/wsdl/s2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public S2_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public S2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public S2_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public S2_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public S2_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public S2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns S2
     */
    @WebEndpoint(name = "s2SOAP")
    public S2 getS2SOAP() {
        return super.getPort(S2SOAP, S2.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns S2
     */
    @WebEndpoint(name = "s2SOAP")
    public S2 getS2SOAP(WebServiceFeature... features) {
        return super.getPort(S2SOAP, S2.class, features);
    }

}