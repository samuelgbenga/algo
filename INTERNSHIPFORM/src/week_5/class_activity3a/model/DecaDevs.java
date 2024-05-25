package week_5.class_activity3a.model;

import week_5.class_activity3a.enums.Gender;

public class DecaDevs {

    private final String name;

    private final Gender gender;

    public DecaDevs(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName(){
        return name;
    }
    public Gender getGender() {
        return gender;
    }

//    public void setGender(Gender gender) {
//        this.gender = gender;
//    }

    public boolean isFemale() {
        return gender == Gender.FEMALE ;
    }

    public boolean isMale() {
        return gender == Gender.MALE;
    }
}
