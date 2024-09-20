package Arrays;

class Solution {
    public static int findNumbers(int[] nums) {
        int count=0;int n;int digits=0;
        for(int i=0;i<nums.length-1;i++){
            n=nums[i];
            while(n>0){
                digits++;
                n=n/10;
            }
            if(digits%2==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={437,315,322,431,686,264,442};
        System.out.println(findNumbers(nums));
    }
}