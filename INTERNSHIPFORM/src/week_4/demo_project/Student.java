package week_4.demo_project;

public class Student {
    private String admissionId;
    private String firstName;
    private  String  lastName;
    private  String dob;
    private String gender;
    private int age;

    public Student(String admissionId, String firstName, String lastName, String dob, String gender, int age) {
        this.admissionId = admissionId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
    }

    public String getAdmissionId() {
        return admissionId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    protected String getGender() {
        return gender;
    }

    protected int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "admissionId='" + admissionId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

