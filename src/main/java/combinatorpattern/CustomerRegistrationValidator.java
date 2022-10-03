package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public interface CustomerRegistrationValidator extends Function<Customer,ValidationResult> {

    enum ValidationResult {
        VALID,PHONE_NOT_VALID,NOT_ADULT,EMAIL_NOT_VALID
    }

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@")?VALID:EMAIL_NOT_VALID;
    }
    static CustomerRegistrationValidator isPhoneValid(){
        return customer -> customer.getPhoneNumber().startsWith("07")?VALID:PHONE_NOT_VALID;
    }
    static CustomerRegistrationValidator isAdult(){
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears()>16 ?VALID:NOT_ADULT;
    }

    default CustomerRegistrationValidator and (CustomerRegistrationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(VALID)? other.apply(customer): result;
        };
    }
    }
