package combinatorpattern;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    private  String name;
    private  String email;
    private  String phoneNumber;
    private  LocalDate dob;
}