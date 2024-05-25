package week_4.class_activity_5a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferReaderEx {

    public static void main(String[] args) {


        String desktopPath = System.getProperty("user.home")+"/Desktop";

        String filePath = desktopPath + "/student.csv";

        List<String> messages = new ArrayList<>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine())!= null){
                messages.add(line);
            }

            reader.close();

        }catch (Exception e){
            System.out.println("error from buffer"+ e);
        }

//       String[] messageArray = messages.toArray(new String[0]);
//        for(String ms: messageArray){
//            System.out.println(ms);
//        }
        for(String ms: messages){
            System.out.println(ms);
        }
    }
}
