package Searching.Binary;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,3,1};
        int target=3;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int traget){
        int peak=peakIndexInMountainArray(arr);
        int firsttry=orderAgnosticBS(arr,traget,0,peak);
        if(firsttry!=-1){
            return firsttry;
        }
        return orderAgnosticBS(arr,traget,peak+1,arr.length-1);
    }
    public  static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            int mid = 0;
            while (start < end) {
                mid = start + (end - start) / 2;
                if (arr[mid+1] < arr[mid]) {
                    //in decreasing part of array

                    end = mid;
                } else
                    start = mid + 1;
            }
            return start;

    }
    static int orderAgnosticBS(int[] arr,int target,int start,int end){
        int s=0;end =arr.length-1;
        //find whether array is sorted int ascending or descending
        boolean isAsc;
        if(arr[s]<arr[end]){
            isAsc=true;
        }else isAsc=false;


        while(s<=end){
            //find the middle element
//            int mid = (start+end)/2  -----> might be possible the value of (start+end) exceeds the range of int
            int mid = s + (end - s) / 2;
            if(arr[mid]==target){
                return mid;
            }


            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }else
                    s = mid+1;
            }
            else {
                if(target > arr[mid]){
                    end = mid-1;
                }else
                    s = mid+1;
            }
        }
        return -1;
    }
}
