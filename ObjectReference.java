import java.util.*;

class ObjectReference_Test{
    int counter;
    ObjectReference_Test(int counter){
        this.counter =  counter;
    }
}

public class ObjectReference {
    public static void main(String args[]){
        List<String> list = new ArrayList();
        ObjectReference_Test obj = new ObjectReference_Test(3);


        changeState(list, obj);
        
        System.out.println(list.get(0));

        System.out.println(obj.counter);
    }


    public static void changeState(List myList, ObjectReference_Test temp){
        myList.add("Harish");
        temp.counter++;
    }

}
