import java.util.*;

public class OptionalExample {
    public static void main(String args[]){
        OptionalExample.method1(3); //More specified method will be called in the case of more than 1 method exists in the same name.
        //Optional.of
        Optional<Integer> sampleVal = Optional.of(3);
        try{
            Optional<Integer> sampleVal2 = Optional.of(null);
        } catch(NullPointerException ex){
            System.out.println("Null pointer thrown by Optional");
        }
      
        Optional<Integer> sampleVal3 = Optional.ofNullable(null);
        Optional.ofNullable(null).orElse();
        //System.out.println("sampleV4 val is "+sampleVal4);


        String sampleVal5 = Optional.ofNullable(null).orElseThrow(); //Throws NoSuchElementException
        
    }

    static void method1(Number no){
        System.out.println("Inside method1 "+no);
    }

    static void method1(Integer no){ 
        System.out.println(no); 
    }
}
