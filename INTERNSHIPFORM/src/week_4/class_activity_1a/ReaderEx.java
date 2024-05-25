package week_4.class_activity_1a;

import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home")+"/Desktop";

        try{
            Reader r = new FileReader(desktopPath + "/output.csv");

            int readContent = r.read();

            while (readContent != -1){
                System.out.print((char)readContent);
                readContent = r.read();
            }

            r.close();
        }
        catch(IOException e){
            throw new RuntimeException();
        }
    }
}
