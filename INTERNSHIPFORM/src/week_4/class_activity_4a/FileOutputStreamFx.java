package week_4.class_activity_4a;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamFx {

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";



        try {
            FileOutputStream out = new FileOutputStream(desktopPath+"/output.csv");

            String wr = "i am on it";

            byte[]  bytes = wr.getBytes();
            out.write(bytes);
            out.close();

            System.out.println("thank you");
        }catch (IOException e){
           throw new RuntimeException(e);
        }
    }


}
