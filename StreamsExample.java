import java.util.*;
import java.util.stream.IntStream;

class StreamsExample{
	public static void main(String args[]){
		int arr[] = {1,2,34,43,3,23};

		//Find max
		System.out.println(Arrays.stream(arr).max().getAsInt()); //getAsInt will convert the object to primitive type.


		//Primitive Streams
		// There are 3 primitive streams int, long, double

		IntStream.of(1,2,3).forEach(x -> System.out.println(x)); //IntStream accepting range of numbers using of method

		List<String> firstList = List.of("d", "sdf");
		List secondList = Collections.unmodifiableList(firstList); //To create synchronized class
		//secondList.add("sdf"); - throws UnsupportedOperationException


		//Intermediate operations

	}
}