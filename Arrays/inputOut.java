package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class inputOut {
    public static void main(String[] args) {
        int[][] arr=new int[3][2];
        System.out.println(arr.length);//Prints no of rows
        //to take input
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            //for each cell of col in every row
            for(int col =0;col<arr[row].length;col++){
                //col<arr[row].length------> this is to keep loop running until it reaches last index of each row
                arr[row][col]=sc.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            //for each cell of col in every row
            for(int col =0;col<arr[row].length;col++){
                //col<arr[row].length------> this is to keep loop running until it reaches last index of each row
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        //other way to print array using toString method
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        //using enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a    ));
        }
    }
}
