public class TestDefaultMethodsInInterface implements TestDefaultMethodsInInterface_testInterface1, TestDefaultMethodsInInterface_testInterface2{
    public int testMethod(){ //If implementation not provided by this implementing class for the default methods, then it will throw error.
         return 5;
    }

    public void testMethod2(){
        
    }
}

interface TestDefaultMethodsInInterface_testInterface1{
    default int testMethod(){
        return 5;
    }
    void testMethod2();
}

interface TestDefaultMethodsInInterface_testInterface2{
     default int testMethod(){
        return 5;
    }
    void testMethod2();
}