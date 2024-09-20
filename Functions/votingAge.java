package Functions;

import java.util.Scanner;

public class votingAge {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        eligibilty(age);
    }
    static void eligibilty(int n){
        if(n>=18)
            System.out.println("Eligible for voting");
        else System.out.println("Not eligible");
    }
}
