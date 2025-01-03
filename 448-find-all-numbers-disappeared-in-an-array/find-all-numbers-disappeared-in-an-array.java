class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
         int i=0;
       while(i<arr.length){
           int correct=arr[i]-1;
           if(arr[i] != arr[correct]){
               swap(arr,i,correct);
           }else i++;   //unless an index has its
       }

       List<Integer> ans= new ArrayList<>();
       for(int j=0;j<arr.length;j++){
        if(arr[j]!=j+1){
            ans.add(j+1);   
        }
       }
       return ans;
    }
    void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}