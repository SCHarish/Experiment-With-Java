package Design_Principles;

import java.util.ArrayList;
import java.util.List;

abstract class LiskovSubstitutionPrinciple_Vehicle{
  abstract void startEngine();
}

class LiskovSubstitutionPrinciple_Cycle extends LiskovSubstitutionPrinciple_Vehicle{
    void startEngine(){
        throw new EngineNotFoundException("No engine found in cycle");
    }
}

class EngineNotFoundException extends RuntimeException{
    private String msg;

    EngineNotFoundException(String msg){
        this.msg = msg;
    }
}

class LiskovSubstitutionPrinciple_Car extends LiskovSubstitutionPrinciple_Vehicle{
    void startEngine(){
        System.out.println("Car engine started"); //This violates liskov substituion principle, as subclass cannot replace the
        //parent class LiskovSubstitutionPrinciple_Vehicle
    }
}



public class LiskovSubstitutionPrinciple {
    public static void main(String args[]){
        LiskovSubstitutionPrinciple obj = new LiskovSubstitutionPrinciple();
        List<LiskovSubstitutionPrinciple_Vehicle> list = new ArrayList();


        LiskovSubstitutionPrinciple_Vehicle cycle = new LiskovSubstitutionPrinciple_Cycle();
        LiskovSubstitutionPrinciple_Vehicle car = new LiskovSubstitutionPrinciple_Car();

        list.add(cycle);
        list.add(car);


        list.forEach(x -> x.startEngine());
    }
}
