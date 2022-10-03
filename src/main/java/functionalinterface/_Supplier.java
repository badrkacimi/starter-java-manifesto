package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionURL());
        System.out.println(getDBConnectionURLSupplier.get());

    }
    static String getDBConnectionURL(){
        return "jdbc://localhost:3036/usersDb";
    }
    static Supplier<String> getDBConnectionURL= ()
            -> "jdbc://localhost:3036/usersDb";

    static Supplier<List<String>> getDBConnectionURLSupplier= ()
            -> List.of("jdbc://localhost:3036/usersDb","jdbc://localhost:3036/usersDb");
}
