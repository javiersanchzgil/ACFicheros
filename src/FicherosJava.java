
import java.io.*;


public class FicherosJava { //Mirar todos los metodos en api de java

    public static void main (String [] args) throws IOException {

        //Formas de abrir un fichero
        File f1 = new File ("fichero.txt"); // Se puede acceder de varias formas
        //File f = new File ("C:\\prueba\\dir","fichero.txt");
        //File f = new File("C:"+File.separator+"dir"+File.separator+"fichero.txt");

        System.out.println(f1.getName());

        //FileWriter
        //FileReader
        //Te leen caracter por caracter
        FileWriter fW = new FileWriter(f1,false);//si lo abres en true escribe a la drecha de lo que ya haya escrito, si abres en false sobreescribe todo lo que haya escrito con lo que pongas
        FileReader fR = new FileReader(f1);

        //Write y cerramos
        fW.write('c');
        fW.write('x');
        fW.write("Javier");
        fW.close();


        //Read y cerramos
        int car = 0;
        car=fR.read();

        while(car != -1) {
            System.out.println((char)car);
            car=fR.read();

        }
        fR.close();

        System.out.println("----------------------------------");

        //BufferedWriter y BufferedReader
        //Te leen linea a linea

        BufferedWriter bW = new BufferedWriter (new FileWriter(f1,false));//funciona igual que el write pero tiene un afuncion salto de linea (newLine())

        bW.append('j');
        bW.append('t');
        bW.append('r');
        bW.append('e');
        bW.newLine();
        bW.write("JAVIER");
        bW.close();

        BufferedReader bR = new BufferedReader (new FileReader(f1));

        String car1 = "";
        car1=bR.readLine();

        while(car1 != null) {
            System.out.println((String)car1); //tambien igual pero tiene una función readLine() que lee lineas enteras, y devuelve null al final de fichero
            car1=bR.readLine();

        }

        bR.close();

    }
}
