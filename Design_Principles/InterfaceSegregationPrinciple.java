package Design_Principles;

interface InterfaceSegregationPrinciple_Car{
    void applyAcceleration();
    void applyBrake();
    void recharge();
}  

class InterfaceSegregationPrinciple_Tesla implements InterfaceSegregationPrinciple_Car{
    public void applyAcceleration(){

    }
    public void applyBrake(){

    }
    public void recharge(){

    }
}  

class InterfaceSegregationPrinciple_Ford implements InterfaceSegregationPrinciple_Car{
    public void applyAcceleration(){

    }
    public void applyBrake(){

    }
    public void recharge(){

    }
}  


public class InterfaceSegregationPrinciple{
    public static void main(String args[]){

    }
}