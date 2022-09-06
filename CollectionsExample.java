import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.*;

public class CollectionsExample {

    Object ref;
    public static void main(String args[]){
        CollectionsExample collObj = new CollectionsExample();
        Object obj1 = collObj.getObject();
        Object obj2 = collObj.getObject();

        // Find distinct names

        List<String> names = new ArrayList();
        names.add("Harish");
        names.add("Ram");
        names.add("Harish");

        names = names.stream().distinct().collect(Collectors.toList());
        long count = names.stream().sorted().count();

        System.out.println("Names count "+count);

        names.forEach(x -> System.out.println(x));
    }
    
    public Object getObject(){
        if(ref == null)
            ref = new ArrayList();

        return ref;         
    }
}
