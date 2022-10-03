package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
       Customer customer = new Customer();
       customer.setName("Lilia");
       customer.setEmail("lila@gmail.com");
       customer.setPhoneNumber("0736363667");
       customer.setDob(LocalDate.of(2025,4,27));

        System.out.println(isEmailValid().and(isAdult()).and(isPhoneValid()).apply(customer));
    }
}
