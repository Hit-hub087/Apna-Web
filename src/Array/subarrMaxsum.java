package Array;
//it is brute force solutioon it's time complexity is O(n)^3 which is a worst case we can optimize that solution
public class subarrMaxsum {
    public static void maxsum(int num[]){
        int currsum=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length;j++){
                currsum=0;
                for(int k=i; k<=j; k++){
                    currsum += num[k];
                }
                if(max<currsum){
                    max=currsum;
                }
                System.out.println(currsum);
            }
            System.out.println();
        }
        System.out.println("Max sum is "+max);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        maxsum(num);
    }
}
