import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String args[]){
        Comparator<String> ascendingComparator = (a, b) -> a.compareTo(b);
        String[] input = new String[]{
            "hsdf","erer","cc2az","mlsdf"
        };

        Arrays.sort(input);

        Arrays.sort(input, Collections.reverseOrder());

        Collections.sort(Arrays.asList(input), ascendingComparator);

        Comparator<String> descendingComparator = (a ,b) ->{
            return b.compareTo(a);
        };

        Collections.sort(Arrays.asList(input), descendingComparator);

        System.out.println(input);

    }
}
