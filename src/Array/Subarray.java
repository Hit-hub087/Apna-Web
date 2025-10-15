package Array;

public class Subarray {
    public static void subarr(int num[]){
        int ts=0;
        for(int i=0; i<num.length;i++){
            for (int j=i;j<num.length; j++){

                for(int k=i; k<=j;k++){
                    System.out.print(num[k]+" ");
                }

                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total subarray :"+ts);
    }

    public static void main(String[] args) {
        int num[]={2,4,3,23,43,44,21};
        subarr(num);
    }
}
