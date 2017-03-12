
package LocationService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WS-Interface", targetNamespace = "http://schemas.hu.fnt.nl/berichten/message")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WSInterface {


    /**
     * 
     * @param request
     * @return
     *     returns LocationService.Response
     * @throws Inputfault
     */
    @WebMethod
    @WebResult(name = "locationResponse", targetNamespace = "http://schemas.hu.fnt.nl/berichten/response", partName = "response")
    public Response locationService(
        @WebParam(name = "locationRequest", targetNamespace = "http://schemas.hu.fnt.nl/berichten/request", partName = "request")
        String request)
        throws Inputfault
    ;

}
