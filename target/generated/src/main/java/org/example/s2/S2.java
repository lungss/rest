package org.example.s2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2020-03-26T16:35:03.590+08:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://www.example.org/s2/", name = "s2")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface S2 {

    @WebMethod(action = "http://www.example.org/s2/s2Operation")
    @WebResult(name = "s2response", targetNamespace = "http://www.example.org/s2/", partName = "parameters")
    public S2Response s2Operation(
        @WebParam(partName = "parameters", name = "s2request", targetNamespace = "http://www.example.org/s2/")
        S2Request parameters
    );
}
