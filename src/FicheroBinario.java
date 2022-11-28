
import java.io.*;
public class FicheroBinario {
    public static void main(String[] args) throws IOException {
        System.out.println("Vamos a crear un fichero");
        String nomArchivo = "textito.txt";
        File f = new File(nomArchivo);

        System.out.println("El nombre del archivo es: " + f.getName());
        FileWriter fw = new FileWriter(f);
        fw.write("Pito");
        fw.write('T');
        fw.append(" ME GUSTAN LOS TRENES");
        fw.write(" A MI TAMBIÉN MAMAHUEVASO".toCharArray());




        FileReader fr = new FileReader(f);
        int car = fr.read();
        while(!(car == -1)){
            if(!(car == 32))
                System.out.print((((char)car)));
            else
                System.out.print(" ");
            car = fr.read();
        }

        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.write("PAPO PEPO");
        bw.write(" PARA PE PAPO PEPO".toCharArray());
        bw.close();
        BufferedReader br = new BufferedReader(fr);
        car = br.read();
        while(!(car == -1)){
            if(!(car == 32))
                System.out.print((char)car);
            else
                System.out.print(" ");
            car = br.read();
        }

        main2();
    }

    public static void main2() throws IOException {
        System.out.println();
        String nomArchivo = "textitoBinario.bin";
        File f = new File(nomArchivo);

        ObjectOutputStream fo;
        if(f.exists())
            fo = new MiObjectBinario(new FileOutputStream(f, true));
        else
            fo = new ObjectOutputStream(new FileOutputStream(f));

        fo.writeObject("Primero");
        fo.writeObject("Segundo");
        Persona p1 = new Persona("Pepito", 20);
        fo.writeObject(p1);
        fo.writeObject(new Persona("Pepita", 21));
        fo.close();


        ObjectInputStream fi = null;
        try{
            fi = new ObjectInputStream(new FileInputStream(f));
            do{
                System.out.println(fi.readObject());
            }while(true);
        } catch(EOFException e){
            System.out.println("Final de fichero");
        } catch (Exception e){
            System.out.println(e);
        }

        fi.close();
    }
}

