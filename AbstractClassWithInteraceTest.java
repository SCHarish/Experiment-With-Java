public class AbstractClassWithInteraceTest extends AbstractClassWithInteraceTest_abstractClass implements AbstractClassWithInteraceTest_interface1{
    public int testMethod(){ //If this implementation not provided, error will be thrown.
        return 4;
    }

    public static void main(String args[]){
        AbstractClassWithInteraceTest obj = new AbstractClassWithInteraceTest();
        System.out.println(obj.testMethod());
        System.out.println(obj.testMethod3());
    }
    //public abstract int testMethod2();
}

interface AbstractClassWithInteraceTest_interface1{
    default int testMethod(){
        return 1;
    }

    //int testMethod2();
}

abstract class AbstractClassWithInteraceTest_abstractClass{
     int testMethod(){
        return 6;
    }

    int testMethod3(){
        return 10;
    }
}