import java.util.*;

public class Sort2dArray {
    public static void main(String args[]){
        int[][] input = new int[][]{
            {2,5}, {3,4}, {6, 9}, {2,1}
        };


        Arrays.sort(input, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
           
                return Integer.compare(b[1], a[1]);
            }
        });
    }
}
