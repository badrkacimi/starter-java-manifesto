package optionals;

import java.util.Optional;

public class _Optionals {
    public static void main(String[] args) {
        Object o = Optional.ofNullable(null).
                orElseGet(() -> "Hello");
        System.out.println(o);

        Optional.ofNullable("Badr").
                ifPresent(System.out::println);

        Optional.ofNullable("Badr").ifPresentOrElse(
                email-> System.out.println("Send email to " + email),
                ()-> System.out.println("Cannot send email"));
    }
}
