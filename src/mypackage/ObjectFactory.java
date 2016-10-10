
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _Biblioteca_QNAME = new QName("", "biblioteca");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BibliotecaType }
     * 
     */
    public BibliotecaType createBibliotecaType() {
        return new BibliotecaType();
    }

    /**
     * Create an instance of {@link LibroType }
     * 
     */
    public LibroType createLibroType() {
        return new LibroType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BibliotecaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "biblioteca")
    public JAXBElement<BibliotecaType> createBiblioteca(BibliotecaType value) {
        return new JAXBElement<BibliotecaType>(_Biblioteca_QNAME, BibliotecaType.class, null, value);
    }

}
