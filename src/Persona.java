import java.io.Serializable;

public class Persona implements Serializable{


    private static final long serialVersionUID = -1577157610399250541L;
    private String nombre;
    private int edad;
    //private transient int edad; transiet lo que hace es ocultar el dato, al mostrar por pantalla saldría un 0



    Persona (String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;

    }

    public String toString () {
        return nombre + "" + edad;
    }


}