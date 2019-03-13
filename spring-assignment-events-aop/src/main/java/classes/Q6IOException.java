package classes;

import java.io.*;

public class Q6IOException {

    public void methodCreateFile() throws IOException {
        File file = new File("com/src/ttn.txt");
        file.createNewFile();
    }

    public void methodDeleteFile() throws IOException {
        File file = new File("/home/ttn/readonlyfile.txt");
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(5);
    }
}
