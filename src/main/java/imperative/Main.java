package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("ALICE",FEMALE),
                new Person("ALI",MALE),
                new Person("BADR",MALE),
                new Person("SALMA", FEMALE)
        );
        System.out.println("// Imperative approach");
        List<Person> females =new ArrayList<>();

        for(Person person : people){
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        females.forEach(System.out::println);

        System.out.println("// Declarative approach");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        people.stream().
                filter(personPredicate).
                forEach(System.out::println);

    }
    static class Person {
        private final String name;
        private final Gender gender;

         Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender {
        MALE,FEMALE
    }
}
