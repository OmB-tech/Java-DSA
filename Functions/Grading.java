package Functions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int m = sc.nextInt();
        System.out.println("Your grade is: "+grade(m));
    }
    static String grade(int a){
//        int per = (int)a /10;        we will not use this as it will take extra space hence:
        switch((int)a /10){
            case 9:
                return "A+";
//                break;
            case 8:
                return "A";
//                break;
            case 7:
                return "B";
//            break;
            case 6:
                return "C";
//            break;
            case 5:
                return "D";
//            break;
            default:
                return "Fail";
//                break;
        }

    }
}
