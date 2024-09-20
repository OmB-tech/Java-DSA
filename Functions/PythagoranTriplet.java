package Functions;

import java.util.Scanner;

public class PythagoranTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the triplet: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(check(a,b,c));
    }
    static String check(int a,int b,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(max*max==(a*a)+(b*b)){
            return "Yes";
        }else return "No";
    }
}
