import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FicheroBinario {

    public static void main (String [] args) throws IOException, FileNotFoundException  {


        //Ponemos la ruta del fichero binario
        File f = new File ("binario2.bin");

        //Creamos un objeto para escribir en el fichero en modo falso para borrar
        ObjectOutputStream fO = null;

        if (f.exists())
            fO = new MiObjectBinario(new FileOutputStream(f,false));

        else
            fO = new ObjectOutputStream (new FileOutputStream (f));

        Persona p1 = new Persona("Javier",23);
        Persona p2 = new Persona("Juan",24);

        fO.writeObject(p1);
        fO.writeObject("Segundo");
        fO.writeObject(p2);

        fO.close();

        //Creamos un objeto para leer el fichero que se tiene que inicializar a null primero

        //mostrar por pantalla


        ObjectInputStream fI = null;

        try {

            fI = new ObjectInputStream (new FileInputStream(f));

            do {
                System.out.println(fI.readObject());
            }while (true);

        }catch(EOFException e) {
            System.out.println("Final de fichero");


        }catch(Exception e) {
            System.out.println(e.getMessage());
        };


        fI.close();

    }



}