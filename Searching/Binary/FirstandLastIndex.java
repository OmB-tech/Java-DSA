package Searching.Binary;
//IN THIS QUESTION, BINARY SEARCH IS USED TWICE: LINE-16 & LINE-24
public class FirstandLastIndex {
        public int[] searchRange(int[] nums, int target) {
            int[] ans={-1,-1};
            int start=search(nums,target,true);
            int last=search(nums,target,false);
            ans[0]=start;
            ans[1]=last;
            return ans;
        }
        int search(int[] nums,int target,boolean findStart){
            int ans= -1;
            int start = 0;
            int end=nums.length-1;
            while(start<=end){
                int mid=start+ (end-start)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }else if(target>nums[mid]){
                    start=mid+1;
                }else{
                    //potential ans found
                    ans=mid;
                    if(findStart){
                        end=mid-1;
                    }else start=mid+1;
                }
            }return ans;
        }
    }


