package Searching.Binary;

public class FLoorNum {
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67,78,89,90,234,456,678};
        int target=66;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;


        //ASCENDING
        int mid = 0;
        while (start <= end) {
            //find the middle element
//            int mid = (start+end)/2  -----> might be possible the value of (start+end) exceeds the range of int
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return arr[end];


        //DESCENDING
//        while(start<=end){
//            int mid = start + (end - start) / 2;
//            if(target < arr[mid]){
//                start = mid+1;
//            }else if(target>arr[mid]){
//                end=mid-1;
//            }else {
//                return mid;
//            }
//        }
//        return arr[end];

    }
}
