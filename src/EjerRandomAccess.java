import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjerRandomAccess {


    public static void main(String[] args) {

        /*Leer el fichero ya creado quijote.txt de forma aleatoria
        mostar por pantalla el contenido del fichero
        cambiar las vocales por su siguiente vocal respetando mayusculas y minusculas en una funcion
        guardar el resultado en un fichero nuevo quijote2.txt
        mostrar por pantalla el contenido del fichero nuevo*/

        RandomAccessFile fA = null;
        RandomAccessFile fB = null;

        try {
            fA = new RandomAccessFile("quijote.txt", "r");
            fB = new RandomAccessFile("quijote2.txt", "rw");

            String linea = "";
            String linea2 = "";

            do {
                linea = fA.readLine();
                if (linea != null) {
                    linea2 = cambiarVocales(linea);
                    fB.writeUTF(linea2);
                }
            } while (linea != null);

            fA.seek(0);
            fB.seek(0);

            do {
                linea = fA.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }
            } while (linea != null);

            System.out.println("-------------------------------------------------------");

            do {
                linea2 = fB.readLine();
                if (linea2 != null) {
                    System.out.println(linea2);
                }
            } while (linea2 != null);

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el fichero");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } finally {
            try {
                if (fA != null) {
                    fA.close();
                }
                if (fB != null) {
                    fB.close();
                }
            } catch (IOException e) {
                System.out.println("Error de entrada/salida");
            }
        }

    }

    public static String cambiarVocales(String linea) {
        String linea2 = "";
        for (int i = 0; i < linea.length(); i++) {
            char c = linea.charAt(i);
            if (c == 'a' || c == 'A') {
                linea2 += 'e';
            } else if (c == 'e' || c == 'E') {
                linea2 += 'i';
            } else if (c == 'i' || c == 'I') {
                linea2 += 'o';
            } else if (c == 'o' || c == 'O') {
                linea2 += 'u';
            } else if (c == 'u' || c == 'U') {
                linea2 += 'a';
            } else {
                linea2 += c;
            }
        }
        return linea2;
    }





}
