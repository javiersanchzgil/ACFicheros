import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAleatoriosRandom {
    public static void main(String[] args) throws IOException {

        File f = new File ("fichAleatorio.bin");

        RandomAccessFile fA = new RandomAccessFile(f,"rw");

        fA.writeUTF("AAAA");
        fA.writeInt(23);

        fA.writeUTF("JAVIER");
        fA.writeInt(2);

        fA.close();

        RandomAccessFile fB = new RandomAccessFile(f,"r");

        try {
            do {

                System.out.println(fB.readUTF()+ " " + fB.readInt());

            }while(true);
        }catch (Exception e) {

        }
        fB.close();


    }

}
