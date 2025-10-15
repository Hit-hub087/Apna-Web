package Array;

public class Patterns {
    public static void hollow_patterns(int r, int c){
        for(int i = 1; i<=r; i++){
            for(int j=1; j<=c;j++){
                if( i==1 || i==r || j==1 || j==c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void half_reverse_pyramid(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rhombous_triangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n; j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
    public static void Diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void Num_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void Palindromic_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        hollow_patterns(4,5);
//        half_reverse_pyramid(5);
//        Butterfly(5);
//        rhombous_triangle(5);
//        hollow_rhombus(5);
//        Diamond(4);
//        Num_Pyramid(5);
        Palindromic_pyramid(5);
    }
}
