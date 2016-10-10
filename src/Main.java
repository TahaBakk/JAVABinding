
import mypackage.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by x3727349s on 10/10/16.
 */
public class Main {

    public static void main(String[] args) {

        afegirLlibre();
        mostrar();

    }
    public static void mostrar(){

        File f1 = new File("biblio.xml");

        LibroType lb =new LibroType();

        lb.setFecha("444 ac");
        lb.setAutor("Sun Tzu");
        lb.setTitulo("El arte de la guerra");

        try {


            //SAX i DAM (factoria). en este caso  se llama contexto
            JAXBContext context = JAXBContext.newInstance(BibliotecaType.class);

            //unmarshaller es para "desunir" el fitxero xml
            //"desunir" significa  separar la logica xml y pasarla
            //a listado de classe java

            Unmarshaller um = context.createUnmarshaller();
            BibliotecaType bl= (BibliotecaType) um.unmarshal(f1);

            System.out.println("Hi ha"+bl.getLibro().size());

            for (int i = 0; i<bl.getLibro().size(); i++){
                System.out.println("El libro amb titol "+bl.getLibro().get(i).getTitulo()+" te com autor "+bl.getLibro().get(i).getAutor()+" va ser publicat "+bl.getLibro().get(i).getFecha()+".");
            }

        } catch (JAXBException e) {e.printStackTrace();}



    }

    public static void afegirLlibre() {

        File f1 = new File("biblio.xml");

        LibroType lb =new LibroType();

        lb.setFecha("444 ac");
        lb.setAutor("Sun Tzu");
        lb.setTitulo("El arte de la guerra");

        //SAX i DAM (factoria). en este caso  se llama contexto
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(BibliotecaType.class);

            //"desunir" significa  separar la logica xml y pasarla
            //a listado de classe java
            //unmarshaller es para "desunir" el fitxero xml

            Unmarshaller um = context.createUnmarshaller();
            BibliotecaType bl= (BibliotecaType) um.unmarshal(f1);

            bl.getLibro().add(lb);

            guardar(bl);



        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public static void guardar(BibliotecaType bl) {

        File flg =new File("biblio2.xml");

        try {
            JAXBContext context = JAXBContext.newInstance(BibliotecaType.class);
            Marshaller n = (context.createMarshaller());
            n.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            n.marshal(bl,flg);


        } catch (JAXBException e) {
            e.printStackTrace();
        }


    }

}
