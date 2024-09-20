package Searching.Binary;

public class OrderAgonsticBS {
    public static void main(String[] args) {
        int[] arr={98,87,76,65,54,43,32,21,10};
        int t=76;
        System.out.println(orderAgnosticBS(arr,t));
    }
    static int orderAgnosticBS(int[] arr,int target){
        int s=0;int end =arr.length-1;


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

