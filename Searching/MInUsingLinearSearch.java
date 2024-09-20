package Searching;

public class MInUsingLinearSearch {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,4,3};
        System.out.println(mini(arr));
    }
    public static int mini(int[] n){
        int min=n[0];
        for (int i = 1; i < n.length; i++) {
            if(n[i]<min){
                min=n[i];
            }
        }return min;
    }
}
