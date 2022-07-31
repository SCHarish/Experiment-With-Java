import java.util.ArrayList;

public class CollectionsExample {

    Object ref;
    public static void main(String args[]){
        CollectionsExample collObj = new CollectionsExample();
        Object obj1 = collObj.getObject();
        Object obj2 = collObj.getObject();
    }
    
    public Object getObject(){
        if(ref == null)
            ref = new ArrayList();

        return ref;         
    }
}
