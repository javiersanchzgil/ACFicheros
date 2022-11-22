import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MiObjectBinario extends ObjectOutputStream {

    MiObjectBinario(FileOutputStream fO) throws IOException{
        super(fO);
    }

    protected void writeStreamHeader() {

    }
}

