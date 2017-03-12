
package LocationService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the LocationService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LocationRequest_QNAME = new QName("http://schemas.hu.fnt.nl/berichten/request", "locationRequest");
    private final static QName _LocationResponse_QNAME = new QName("http://schemas.hu.fnt.nl/berichten/response", "locationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: LocationService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.hu.fnt.nl/berichten/request", name = "locationRequest")
    public JAXBElement<String> createLocationRequest(String value) {
        return new JAXBElement<String>(_LocationRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.hu.fnt.nl/berichten/response", name = "locationResponse")
    public JAXBElement<Response> createLocationResponse(Response value) {
        return new JAXBElement<Response>(_LocationResponse_QNAME, Response.class, null, value);
    }

}
