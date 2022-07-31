import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]){
        TreeSet<String> tSet = new TreeSet();
        tSet.add("harish");
        tSet.add("adam");
        tSet.add("water");
        tSet.add("Balloon");
        
        try{
            tSet.add(null); 
        }catch(NullPointerException ex){

        }
        tSet.forEach(x->System.out.println(x));
    }
}
