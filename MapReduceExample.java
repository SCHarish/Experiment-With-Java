import java.util.*;
import java.util.stream.Collectors;
public class MapReduceExample {

    class Person{
        Person(int age){
            this.age = age;
        }
        int age;
    }

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    

        //When to use reduce?

        // To reduce a series of values or stream into a single value


        // When we can use map-reduce?
        //When we are about to iterate the very large sequence. With map-reduce we can do it in parallel.
    
        //Find sum of n elements using reduce.
        // 0 - initialize value for a
        // a  is the accumulator and b is the current value from the array
        int sum = Arrays.stream(arr).reduce(0, (a, b) -> {
            System.out.println("a = "+a);
            System.out.println("b = "+b);
            return a+b;
        });

        //List of names..arrange in alphabetical order using streams.. use sorted method of stream pass a comparator.
        List<String> listofNames = Arrays.asList("Harish", "Vivek", "Ram", "Senthil", "Guna", "Abhishek", "Hitesh", "Nikhil");

        Comparator myComparator = (a, b) ->  ((String)b).compareTo((String)a);
        List<String> result = (List<String>) listofNames.stream().sorted(myComparator).collect(Collectors.toList());

        result.forEach((x) -> System.out.println(x));

        
        //calculate the average age
        MapReduceExample obj = new MapReduceExample();
        MapReduceExample.Person p1 = obj.new Person(2);
        MapReduceExample.Person p2 = obj.new Person(27);
        List<MapReduceExample.Person> list = Arrays.asList(p1, p2);
        Double avg_age = list.stream().mapToInt(x -> x.age).average().getAsDouble();
        System.out.println("Avg age = "+avg_age);


        
    }
}
