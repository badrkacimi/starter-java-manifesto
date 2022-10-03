package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int i = incrementByOne(1);
        System.out.println(i);

        int i2 = incrementByOneFunction.apply(1);
        System.out.println(i2);

        Integer res = incrementByOneFunction.andThen(multiplyBy10Function).apply(3);
        System.out.println(res);
        System.out.println(incrementAndMultiply.apply(1,100));
    }
    static Function<Integer,Integer> incrementByOneFunction= number->number+1;
    static int incrementByOne(int number) { return number+1; }
    static Function<Integer,Integer> multiplyBy10Function =  number->number*10;
    static BiFunction<Integer,Integer,Integer> incrementAndMultiply= (increment,multiply)->
            (increment+1)*(multiply);

}
