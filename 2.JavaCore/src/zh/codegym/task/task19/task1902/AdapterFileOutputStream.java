package zh.codegym.task.task19.task1902;

/* 
适配器
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream implements AmigoStringWriter {
    private FileOutputStream fileOutputStream;

    public static void main(String[] args) {

    }

    public AdapterFileOutputStream(FileOutputStream fileOutputStream) {
        this.fileOutputStream = fileOutputStream;
    }

    @Override
    public void flush() throws IOException {
        this.fileOutputStream.flush();
    }

    @Override
    public void writeString(String s) throws IOException {
        byte[] strToBytes = s.getBytes();
        this.fileOutputStream.write(strToBytes);
    }

    @Override
    public void close() throws IOException {
        this.fileOutputStream.close();
    }
}

