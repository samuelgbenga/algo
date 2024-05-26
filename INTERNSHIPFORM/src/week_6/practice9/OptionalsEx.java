package week_6.practice9;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalsEx {

    Map<Integer, Person> personMap = new HashMap<>();

    public void setPersonMap(Integer key, Person thePerson){
        personMap.put(key, thePerson);
    }

    public Optional<Person> getPersonFromMap(Integer key){
        return Optional.ofNullable(personMap.get(key));
    }


    public static void main(String[] args) {

        OptionalsEx mapDemo = new OptionalsEx();

        mapDemo.setPersonMap(123, new Person("samuel", 56));

        Optional<Person> optPerson = mapDemo.getPersonFromMap(13);

       // optPerson.ifPresent((m)-> System.out.println(m));
        // if key is missing it will not print out error using optionals
        // it will just return empty.
        optPerson.ifPresent(System.out::println);

        // another implementation using map also
        Person person = new Person("Gbenga", 19);

        Optional<Person> personOpt = Optional.of(person);

        //personOpt.map(p-> p.getAge()).filter(age-> age > 18).ifPresent(System.out::println);
//        personOpt.map(p-> {
//            if(p.age > 18)
//            return ("he is old enough "+ person.name);
//            else return ("He is not old enough "+ person.name);
//        }).ifPresent(System.out::println);
       // personOpt.filter(p-> p.age > 18).map(_-> (person.name+" is old enough")).ifPresent(System.out::println);

        personOpt.filter(p-> p.age > 18).map(_-> (person.name+" is old enough"))
                .ifPresentOrElse(System.out::println, ()-> System.out.println("That is good manipulation") );


    }

}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
