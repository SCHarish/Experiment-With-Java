import java.util.ArrayList;
import java.util.List;

public class CoVarianceAndContraVariance {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        List<Double> list2 = new ArrayList<Double>();
        sum(list);
        sum(list2);
    }

    public static void sum(List<? extends Number> list){

    }
}
