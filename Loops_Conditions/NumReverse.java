package Loops_Conditions;

public class NumReverse {
    public static void main(String[] args) {
        int a=1231412;
        int rem;int rev=0;
        while(a>0){
            rem = a%10;
            rev = (rev*10)+rem;
            a=a/10;
        }
        System.out.println(rev);
    }
}
