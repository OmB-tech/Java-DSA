class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] f=new int[n];
        if(k==0){
            return f;
        }
        int direction=k>0 ? 1:-1;
        int steps=Math.abs(k);
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=1;j<=steps;j++){
                int index=(i+direction*j+n)%n;
                sum += code[index];
            }
            f[i]=sum;
        }return f;
    }
}