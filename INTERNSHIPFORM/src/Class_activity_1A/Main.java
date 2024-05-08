public class Main {

    public static void main(String[] args) {
        InternshipForm internshipForm = new InternshipForm("John fofo", 21, "Male");
        InternshipForm internshipForm2 = new InternshipForm("Jane france", 24, "female");


        System.out.println(internshipForm.name);

        System.out.println(internshipForm.age);
        System.out.println(internshipForm.gender);

    }

}
