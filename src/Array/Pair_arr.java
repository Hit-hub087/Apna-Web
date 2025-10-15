package Array;

public class Pair_arr {
    public static void pairs(int num[]){
         int tpair=0;
        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                tpair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs ="+tpair);
    }

    public static void main(String[] args) {
        int num[]={2,4,6,3,2};
        pairs(num);

    }
}
