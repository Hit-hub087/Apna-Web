package Array;
import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("How many Salesman:");
        int r=kb.nextInt();
        int[][] arr = new int[r][];
        for(int a=0;a<arr.length;a++){
            System.out.println("How many sales done by Salesman "+(a+1));
            int c = kb.nextInt();
            arr[a] = new int[c];
            for(int b=0;b<arr[a].length;b++){
                System.out.println("Enter "+(b+1)+" sales value:");
                arr[a][b]= kb.nextInt();
            }
        }
    }
}
//        int[][] arr = new int[4][];
//        arr[0] = new int[4];
//        arr[1] = new int[3];
//        arr[2] = new int[5];
//        arr[3] = new int[3];
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print("Enter for value: arr["+i+"]["+j+"]:");
//                arr[i][j] = kb.nextInt();
//            }
//        }
//        float sum =0,count=0;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                sum = sum+arr[i][j];
//                System.out.print(arr[i][j]+" ");
//                count++;
//            }
//            System.out.println();
//        }
//        System.out.println("The sum of total values in array is "+sum);
//        System.out.println("Average value of array elements "+(sum/count));
