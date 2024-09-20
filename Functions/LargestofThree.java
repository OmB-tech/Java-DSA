package Functions;

import java.util.Scanner;

public class LargestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();int c= sc.nextInt();
        maxi(a,b,c);
        mini(a,b,c);
    }
    static void maxi(int a,int b,int c){
       int max=a;
       if(b>max){
           max=b;
       }
       if(c>max){
           max=c;
       }
        System.out.println(max+" is largest");
    }
    static void mini(int a,int b,int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        System.out.println(min+" is smallest");
}}

