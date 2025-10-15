package Array;

public class subarrMaxsum1 {
    public static void maxsum(int num[]){
        int currsum=0;
        int max = Integer.MIN_VALUE;
        //prefix-array
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+num[i];
        }
        //for-subarrays
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currsum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(max < currsum){
                    max = currsum;
                }
                System.out.println(currsum+" ");
            }
            System.out.println();
        }
        System.out.println("The max sum is :"+max);

    }

    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxsum(num);
    }
}
