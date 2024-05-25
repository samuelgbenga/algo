package week_4.class_activity_1a;

import java.io.FileWriter;
import java.io.Writer;

public class writerEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            Writer wr = new FileWriter(desktopPath + "/output.csv");
            String fileContent = "I am learning nothing now";
            wr.write(fileContent);

            wr.close();
            System.out.println("it worked");
        }
        catch (Exception e){
            System.out.println("the error is on main class");
        }
    }
}
