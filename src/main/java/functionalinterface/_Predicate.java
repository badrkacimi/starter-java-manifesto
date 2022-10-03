package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("06343076886"));
        System.out.println(isPhoneNumberValidPredicate.test("0734307688"));
        System.out.println(isPhoneNumberValidPredicate.test("0734307688"));
        System.out.println(isPhoneNumberValidAndContains3.test("0734307688"));
        System.out.println(isPhoneNumberValidAndContainsBiPred.test("0734307688","3"));


    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==10;
    }
    static Predicate<String> isPhoneNumberValidPredicate=phoneNumber
            ->phoneNumber.startsWith("07") && phoneNumber.length()==10;

    static Predicate<String> isPhoneNumberContains3Predicate=phoneNumber
            ->phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidAndContains3=
            isPhoneNumberValidPredicate.and(isPhoneNumberContains3Predicate);

    static BiPredicate<String,String> isPhoneNumberValidAndContainsBiPred=(phoneNumber,number)->
            phoneNumber.startsWith("07") && phoneNumber.length()==10
                    && phoneNumber.contains(number);
}
