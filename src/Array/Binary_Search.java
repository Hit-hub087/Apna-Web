package Array;

import static java.util.Arrays.sort;

public class Binary_Search {
    public static int binarySearch(int numbers[],int key){
        int start=0,end = numbers.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]>key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,445,34,5,6,77,88,99,102};
        int key = 445;
        sort(numbers);
        for(int x : numbers){

        System.out.print(x+" ");
        }
        System.out.println("\nThe index value is:"+binarySearch(numbers,key));
    }

} 
