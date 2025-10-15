package Array;

public class BinoCoff {
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<= n;i++){
            f = f*i;
        }
        return f;
    }
    public static int bincoff(int n , int r){
        int fn = factorial(n);
        int fr = factorial(r);
        int fnr =factorial(n-r);
        int factr = fn/(fr*fnr);
        return factr;
    }

    public static void main(String[] args) {
        System.out.println(bincoff(5,3));
    }
}
