package Searching.Binary;

public class CeilingNum {
    public static void main(String[] args) {
        int[] arr={12,23,34,45,56,67,78,89,90,234,456,678};
        int target=679;
        System.out.println(binarySearch(arr,target));
    }
    //      RETURN NO >= TARGET
    public static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        //WHAT IF THE TARGET IS GREATER THAN THE  GREATEST ELELMENT IN THE ARRAY:
        if(target>arr[arr.length-1]){
            return -1;
        }
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
        return start;


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
//        return start;

    }
}
