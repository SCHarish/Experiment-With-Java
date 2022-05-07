import java.util.*;
public class ObjectReference {
    public static void main(String args[]){
        List<String> list = new ArrayList();
        changeState(list);
        System.out.println(list.get(0));
    }


    public static void changeState(List myList){
        myList.add("Harish");
    }

}
