package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("ALICE",FEMALE),
                new Person("ALI",MALE),
                new Person("BADR",MALE),
                new Person("SALMA", FEMALE)
        );
      people.stream().map(person -> person.gender).collect(Collectors.toSet()).
              forEach(System.out::println);

        Function<Person, String> personStringFunction = person -> person.name;
        people.stream().map(personStringFunction).
                mapToInt(String::length).
                forEach(System.out::println);

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean b = people.stream().allMatch(personPredicate);
        System.out.println(b);

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
