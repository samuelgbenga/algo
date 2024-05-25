package week_4.demo_project;

import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {


        Student[] students = {
                new Student("admi", "samu", "gbenga",
                        "2/3/4", "female", 2),
                new Student("adm34", "sameee", "gbga",
                        "2/3/4", "male", 2),
                new Student("amin", "sam", "gbea",
                        "2/3/4", "female", 20),
                new Student("ain", "sam", "gbega",
                        "2/3/4", "male", 2),
                new Student("an", "samyy", "gbenga",
                        "2/3/4", "female", 2),
        };


        String desktopPath = System.getProperty("user.home")+"/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath+"/student.csv");
            fw.write("AdmissionId, FirstName, LastName, DOB, Gender, Age\n");

            for(Student student: students){
                fw.write(student.getAdmissionId()+", "+
                        student.getFirstName()+", "+student.getLastName()+", "
                +student.getDob()+", "+student.getGender()+", "+
                        student.getAge()+"\n");
            }

            fw.close();


        }catch (Exception e){
            System.out.println("error from read student"+ e);
        }

    }
}
