package week_4.class_activity_6a;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home")+"/Desktop";
        boolean createdAgain = false;
        try {
          File file = new File(desktopPath+"/myFile.csv");

          if(file.createNewFile()){

              System.out.println("New File created");
          }
          else{
              System.out.println("file already existed.");

              if(file.delete()){
                  System.out.println("so we had " +
                          "to delete it again to create anew");
                  //createdAgain = file.createNewFile();
              }
          }
            System.out.println(createdAgain);

        }catch (Exception e){
            System.out.println("error from file class: "+e);
        }
    }
}
