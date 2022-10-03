package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
      Customer lilia = new Customer("Lilia","212634302482");
      greetCustomerConsumer.accept(lilia);
      greetCustomerConsumer2.accept(lilia,true);
    }
    static Consumer<Customer> greetCustomerConsumer = customer
            -> System.out.println("Hello "+ customer.customerName +" Phone " +customer.customerPhone);
    static BiConsumer<Customer,Boolean> greetCustomerConsumer2=(customer, b)
            -> System.out.println("Hello "+ customer.customerName +
            (b? " Phone " +customer.customerPhone:" N/A"));
    static class Customer{
        private final String customerName;
        private final String customerPhone;


        Customer(String customerName, String customerPhone) {
            this.customerName = customerName;
            this.customerPhone = customerPhone;
        }
    }
}
