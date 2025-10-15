package Array;
import java.util.*;

public class Gnumber {
    public static int Largest_num(int Numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<Numbers.length; i++){
            if(largest< Numbers[i]){
                largest = Numbers[i];
            }
            if(smallest > Numbers[i]){
                smallest = Numbers[i];
            }
        }
        System.out.println("Smallest value is:"+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int Numbers[]={2,4,3,20,44,3,24,2,22,33,44,32};
        System.out.println("The largest Number is :"+Largest_num(Numbers));
    }
}
