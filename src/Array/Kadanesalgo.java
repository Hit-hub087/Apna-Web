package Array;

public class Kadanesalgo {
    public static void maxsum(int num[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            cs = cs+num[i];
            if(cs <0){
                cs =0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.println("our max sum of subarrays is: "+ ms);
    }

    public static void main(String[] args) {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        maxsum(num);
    }
}
