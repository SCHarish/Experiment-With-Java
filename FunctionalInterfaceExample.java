import java.util.function.*;
public class FunctionalInterfaceExample {

    public static void main(String args[]){

        //Predicate functional interface has test method which accepts any object but returns a boolean
        Predicate<Integer> isEven = (x) -> x % 2 == 0;
        System.out.println("No. is " +isEven.test(2));


        //Function accepts one integer and returns an integer..Use apply method for the invokation.
        Function<Integer, Integer> myfunc = (no) -> no * 2;
        System.out.println("Result is "+myfunc.apply(5));

        //Consumer
        Supplier<Integer> mySupplier =  () -> { return 5; };
        
    }
}
