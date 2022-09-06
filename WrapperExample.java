public class WrapperExample{
    public static void main(String args[]){
        Integer i = 5; // Autoboxing
        int n = i; //unboxing
        changeValue(i);
        System.out.println(i); //value will not change to 6 because, wrapper classes are immutable.
    }

    static void changeValue(Integer no){
         no++;
    }
}