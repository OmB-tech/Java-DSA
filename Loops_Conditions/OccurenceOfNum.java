package Loops_Conditions;
import java.util.Scanner;
public class OccurenceOfNum {
    public static void main(String[] args) {
        int a=1231412;
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int rem;int count=0;
        while(a>0){
            rem = a%10;
            if(rem==n){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
