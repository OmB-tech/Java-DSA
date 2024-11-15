class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int temp=target-numbers[i];
            int start=i+1; int end=numbers.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(numbers[mid]==temp){
                    return new int[]{i+1,mid+1};
                }else if(numbers[mid]<temp){
                    start=mid+1;
                }else end=mid-1;
            }
        }return new int[]{-1,-1};
    }
}