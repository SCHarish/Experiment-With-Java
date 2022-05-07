import java.util.*;
import java.util.stream.Collectors;
public class HashMapTest {
    public static void main(String args[]){
        //sort the hashmap by keys
        Map<String, String> testMap = new LinkedHashMap<>();
        testMap.put("Hello", "World");
        testMap.put("Block", "Buster");
        testMap.put("Tom", "Jerry");
        testMap.put("Moon","Knight");

        List myList = new ArrayList<>(testMap.keySet());
        
       //Sort by keys
       testMap = testMap.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

       for(Map.Entry<String, String> entry : testMap.entrySet()){
           System.out.println(entry.getKey());
       }

       //Sort by values
     

    }
}
