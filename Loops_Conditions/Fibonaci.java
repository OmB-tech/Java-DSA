package Loops_Conditions;
import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] args) {
        int a =0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();int next;
        for(int i=1;i<=n;i++){
            System.out.println(a+" ");
            next = a+b;
            a=b;
            b=next;
        }
    }
}
