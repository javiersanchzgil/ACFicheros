
public class ApuntesFicherosJava {

    public static void main(String[] args) {
        //    // TODO code application logic here

        //funciones ficheros java
        //File


        //crear fichero
        //File fichero = new File("C:\\Users\\Usuario\\Desktop\\fichero.txt");

        //escribir en fichero
        //FileWriter fw = new FileWriter(fichero);
        //BufferedWriter bw = new BufferedWriter(fw);
        //bw.write("Hola mundo");
        //bw.close();

        //leer fichero
        //FileReader fr = new FileReader(fichero);
        //BufferedReader br = new BufferedReader(fr);
        //String linea = br.readLine();
        //while(linea != null){
        //    System.out.println(linea);
        //    linea = br.readLine();
        //}

        //borrar fichero
        //fichero.delete();

        //copiar fichero
        //File fichero2 = new File("C:\\Users\\Usuario\\Desktop\\fichero2.txt");
        //FileInputStream fis = new FileInputStream(fichero);
        //FileOutputStream fos = new FileOutputStream(fichero2);
        //FileChannel canalOrigen = fis.getChannel();
        //FileChannel canalDestino = fos.getChannel();
        //canalOrigen.transferTo(0, canalOrigen.size(), canalDestino);
        //canalOrigen.close();
        //canalDestino.close();
        //fis.close();
        //fos.close();

        //mover fichero
        //fichero2.renameTo(new File("C:\\Users\\Usuario\\Desktop\\fichero3.txt"));

        //renombrar fichero
        //fichero2.renameTo(new File("C:\\Users\\Usuario\\Desktop\\fichero2.txt"));

        //comprobar si existe
        //System.out.println(fichero.exists());

        //comprobar si es un directorio
        //System.out.println(fichero.isDirectory());

        //comprobar si es un fichero
        //System.out.println(fichero.isFile());

        //crear directorio
        //File directorio = new File("C:\\Users\\Usuario\\Desktop\\directorio");
        //directorio.mkdir();

        //borrar directorio
        //directorio.delete();

        //listar directorio
        //File directorio = new File("C:\\Users\\Usuario\\Desktop\\directorio");
        //String[] ficheros = directorio.list();
        //for(int x=0;x<ficheros.length;x++){
        //    System.out.println(ficheros[x]);
        //}

        //listar directorio recursivo
        //File directorio = new File("C:\\Users\\Usuario\\Desktop\\directorio");
        //String[] ficheros = directorio.list();
        //for(int x=0;x<ficheros.length;x++){
        //    System.out.println(ficheros[x]);
        //}

        //listar directorio recursivo
        //File directorio = new File("C:\\Users\\Usuario\\Desktop\\directorio");
        //String[] ficheros = directorio.list();
        //for(int x=0;x<ficheros.length;x++){
        //    System.out.println(ficheros[x]);
        //}


    }


}
