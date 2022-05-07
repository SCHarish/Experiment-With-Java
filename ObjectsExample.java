public class ObjectsExample {
    public static void main(String args[]){
        ObjectsExample obj = new ObjectsExample();


        Class c = null;
        
        try{
            c = Class.forName("ObjectsExample");
            c.newInstance()
        }catch(ClassNotFoundException ex){

        }

    }
}
