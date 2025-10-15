package Array;

public class Linear_Searcch {
    public static int search(int Numbers[], int target) {
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == target) {
                return i;
            }
        }
            return -1;
    }

    public static void main(String[] args) {
        int Numbers[]={2,4,45,32,33,23,21};
        int target = 32;
       int index = search(Numbers,target);
        if(index == -1){
            System.out.println("The Value is not in the array");
        }else{
            System.out.println("The value at index "+index+" of the array");
        }
    }
}
