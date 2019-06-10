
package importservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the importservice package. 
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

    private final static QName _AddThreeResponse_QNAME = new QName("http://webservice/", "addThreeResponse");
    private final static QName _AddTwoResponse_QNAME = new QName("http://webservice/", "addTwoResponse");
    private final static QName _AddThree_QNAME = new QName("http://webservice/", "addThree");
    private final static QName _AddTwo_QNAME = new QName("http://webservice/", "addTwo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: importservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddTwoResponse }
     * 
     */
    public AddTwoResponse createAddTwoResponse() {
        return new AddTwoResponse();
    }

    /**
     * Create an instance of {@link AddThreeResponse }
     * 
     */
    public AddThreeResponse createAddThreeResponse() {
        return new AddThreeResponse();
    }

    /**
     * Create an instance of {@link AddThree }
     * 
     */
    public AddThree createAddThree() {
        return new AddThree();
    }

    /**
     * Create an instance of {@link AddTwo }
     * 
     */
    public AddTwo createAddTwo() {
        return new AddTwo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThreeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addThreeResponse")
    public JAXBElement<AddThreeResponse> createAddThreeResponse(AddThreeResponse value) {
        return new JAXBElement<AddThreeResponse>(_AddThreeResponse_QNAME, AddThreeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTwoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addTwoResponse")
    public JAXBElement<AddTwoResponse> createAddTwoResponse(AddTwoResponse value) {
        return new JAXBElement<AddTwoResponse>(_AddTwoResponse_QNAME, AddTwoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddThree }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addThree")
    public JAXBElement<AddThree> createAddThree(AddThree value) {
        return new JAXBElement<AddThree>(_AddThree_QNAME, AddThree.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTwo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "addTwo")
    public JAXBElement<AddTwo> createAddTwo(AddTwo value) {
        return new JAXBElement<AddTwo>(_AddTwo_QNAME, AddTwo.class, null, value);
    }

}
