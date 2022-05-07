public class OptionalExample {
    public static void main(String args[]){
        OptionalExample.method1(3);
    }

    static void method1(Number no){
        System.out.println("Inside method1 "+no);
    }

    static void method1(Integer no){
        System.out.println(no);
    }
}
