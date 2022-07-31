class MethodOverridingExample_A{
    Object testMethod(){
        System.out.println("parent method called");
        return 5;
    }

    void testMethod2(Integer a){
        System.out.println("Inside parent testMethod2 ");
    }
}



public class MethodOverridingExample extends MethodOverridingExample_A {

    @Override
    String testMethod(){   //overring with covariant return type 
        System.out.println("child method called");
       // super.testMethod();
        return "Overriding with covariant return type";
    }

    // @Override //Here override not possible because return type expected is Double. 
    // void testMethod2(Double a){
    //     System.out.println("Inside child testMethod2 ");
    // }

    //the @Override annotation is removed. So this method will be a different method. It's not treated as overriden method.
    void testMethod2(Double a){
        System.out.println("Inside child testMethod2 ");
    }

    public static void main(String args[]){
        String ex = "";
        MethodOverridingExample obj = new MethodOverridingExample();
        System.out.println(obj.testMethod());
        obj.testMethod2(5.3);
        obj.testMethod2(5);
    }
}




// class MethodOverridingExample_B{
//     Integer 
// }
