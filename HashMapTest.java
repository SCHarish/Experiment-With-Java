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

        //sort by values
        Map<String, String>  resultSortedByValues = testMap.entrySet().stream().sorted((a, b) -> a.getValue().compareTo(b.getValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        List myList = new ArrayList<>(testMap.keySet());
       // testMap = testMap.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).collect(Collectors.toMap(keyMapper, valueMapper).toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    //    //Sort by keys
    //    testMap = testMap.entrySet().stream().sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).collect(Collectors.toMap(keyMapper, valueMapper).toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

    //    for(Map.Entry<String, String> entry : testMap.entrySet()){
    //        System.out.println(entry.getKey());
    //    }

       //Sort by values
     System.out.println("============Sory by Values===============");
       Map<String, Integer> map = new HashMap();

        List<Map.Entry<String, Integer>> resultList = new ArrayList();

        map.put("Harish", 100);
        map.put("Ram", 200);
        map.put("Vasu", 10);
       // TreeSet
       // Object obj = new Object();
        Set<Map.Entry<String, Integer>> hset = map.entrySet();
        
        resultList = hset.stream().sorted((emp1, emp2) -> Integer.compare(emp2.getValue(), emp1.getValue())).collect(Collectors.toList());
       resultList.forEach(x -> System.out.println(x.getKey()));



       Set<Map.Entry<String, Integer>> mySet = map.entrySet();
       Comparator<Map.Entry<String,Integer>> nameComparator = (a ,b) -> a.getKey().compareTo(b.getKey()); //Functional Interface and lambda usage
       mySet.stream().sorted(nameComparator).collect(Collectors.toMap());
    }
}
