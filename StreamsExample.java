import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.function.*;

class StreamsExample{

	static class Employee{
		String name;
		int salary;

		Employee(String name, int salary){
			this.name = name;
			this.salary = salary;
		}
	}

	int counter = 0;
	public static void main(String args[]){
		int arr[] = {1,2,34,43,3,23};
		
		//Find max
		System.out.println(Arrays.stream(arr).max().getAsInt()); //getAsInt will convert the object to primitive type.
		StreamsExample obj = new StreamsExample();

		//Primitive Streams
		// There are 3 primitive streams int, long, double

		IntStream.of(1,2,3).forEach(x -> System.out.println(x)); //IntStream accepting range of numbers using of method

		List<String> firstList = List.of("d", "sdf");
		List secondList = Collections.unmodifiableList(firstList); //To create synchronized class
		//secondList.add("sdf"); - throws UnsupportedOperationException

		int sum = IntStream.of(1,2,3).sum();
		int value = 9;
		Stream.of("t").peek((x) -> { 
			obj.counter++;
			System.out.println(value);
			System.out.println("printing sum "+sum);
			System.out.println(x);
		}
		).findAny();

		List<StreamsExample.Employee> employeeList = List.of(new Employee("Harish", 1000), new Employee("Vasu", 40), new Employee("Ram", 10));

		List<StreamsExample.Employee> salareeUpdatedList = employeeList.stream().filter(employee -> employee.salary < 50).map(employee -> new StreamsExample.Employee(employee.name, employee.salary *2)).collect(Collectors.toList());

		salareeUpdatedList.forEach(x-> {
			System.out.println("Name "+x.name); 
			System.out.println("Salary "+ x.salary);
			
		});

	//	firstList.stream().unordered().parallel().collect(Collectors.toCollection(collectionFactory))

		System.out.println("Counter modified in the stream "+obj.counter);
		
		//Sum of even numbers
		int[] numbers = new int[]{ 4, 5, 9 ,2 , 1, 0 , 6, 3, 7, 1, 18};

		IntPredicate test = (no) -> no % 2 == 0;

		Supplier<Integer> supplier = () -> 5;
		
		Function<Integer, Integer> myfunc = (no) -> no * 5;

		Consumer<Integer> consumer = (no) -> System.out.println("Number printed with the consumer "+no);

		consumer.accept(4);

		int result = IntStream.of(numbers).filter(test).reduce(0, (a, b) -> a+b);

		int max_number  = IntStream.of(numbers).filter(test).reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a,b)); 

		System.out.println("Max number "+max_number);
		System.out.println("Sum of even numbers :: "+result);



		List<String> al = List.of("Hello", "asdf", "asf", "ere", "sdfs");
		// Obtaining another  Stream to the array list.
		Spliterator<String> splitr1;
        Stream<String> str1 = al.stream();
        splitr1 = str1.spliterator();
        // trySplit() method
        Spliterator<String> splitr2 = splitr1.trySplit();
          

        // If splitr1 could be split, use splitr2 first.
        if(splitr2 != null) {
        System.out.println("Output from splitr2: ");
        splitr2.forEachRemaining((n) -> System.out.println(n));
        }


  
        // Now, use the splitr
        System.out.println("\nOutput from splitr1: ");
        splitr1.forEachRemaining((n) -> System.out.println(n));

		ConcurrentHashMap<String, Integer> hmap = new ConcurrentHashMap();
		hmap.put("key", 3);
		hmap.put("asdf", null);//concurrent hashmap wont allow null keys and null values.
		Collections.synchronizedMap(hmap);


		ForkJoinPool fk = ForkJoinPool.commonPool();



		List<Integer> numbers_list = new ArrayList<>();
		numbers_list.add(1);
		numbers_list.add(2);
		numbers_list.add(3);
		numbers_list.add(3);
		numbers_list.add(4);
		numbers_list.add(5);

    // Count
    long count = numbers_list.stream().count();
    System.out.println("Count : " + count);

    // Find Any
    Integer findEle = numbers_list.stream()
        .findAny()
        .get();
    System.out.println("FindAny : " + findEle);

    // Find First
    Integer findFirstEle = numbers_list.stream()
        .findFirst()
        .get();
    System.out.println("FindFirst : " + findFirstEle);

    // Max
    Integer max = numbers_list.stream()
        .max((a, b) -> a - b)
        .get();
    System.out.println("Max : " + max);

    // Min
    Integer min = numbers_list.stream()
        .min((a, b) -> a - b)
        .get();
    System.out.println("Min : " + min);


	//list.stream().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b));
	}
}