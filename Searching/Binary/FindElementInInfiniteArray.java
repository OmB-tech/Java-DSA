package Searching.Binary;
public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        //Rule: Cant use arr.length function in this
        int[] arr={3,5,7,9,10,90, 100,130,140,160,170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int bs(int[] arr,int target,int start,int end){
        int mid = 0;
        while (start <= end) {
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
        return -1;
    }
    static int ans(int[] arr, int target){
        //first start with a box of size 2
        int start=0;
        int end=1;
        //condition for target to lie in the given range
        while(target>arr[end]){
            int temp=end+1;
            //doubling the size of box
            end= end+ (end-start +1)*2;
            start=temp;
        }
        return bs(arr,target,start,end);
    }
}
