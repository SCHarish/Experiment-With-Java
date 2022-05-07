public class MethodOverloadingExample {
    //We use overloading to achieve polymorphism..
    //When to use polymorphism? Eg. let say you are building some generic framework that take different objects with the same interface
    public static void main(String args[]){

        //trying to overload with null
        MethodOverloadingExample obj = new MethodOverloadingExample();
        obj.testMethod(null); //when passing null values the most specific overloaded method gets called. In this case as string is 
        //more specific type than object..String param method gets called.

    }

   
    //On uncommenting the below code ambigous compile time error will be thrown
    // public void testMethod(Integer number){
    //     System.out.println("Integer method called");
    // }

    // public void testMethod(Number number){
    //     System.out.println("Number method called");
    // }


    public void testMethod(String no){
        System.out.println("String method called");
    }

    public void testMethod(Object str){
        System.out.println("Obejct method called");
    }
}
