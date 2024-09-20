package Searching;

public class LinearSearchInRange {
    public static void main(String[] args) {
      int[] arr={23,21,43,52,52,23};
      int n =search(arr,52,2,6);
        System.out.println(n);
    }
    static int search(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(target==arr[i]){
                return i;
            }
        }return -1;
    }
}
