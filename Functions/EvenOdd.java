package Functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number: ");
        int a = sc.nextInt();
        System.out.println(state(a));
    }
    static String state(int a){
        if(a%2==0){
            return "Even";
        }else return "odd";
    }
}
