package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Factorial is: "+factorial(num));
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            //using recursion
            return (n*factorial(n-1));
        }
    }

}
