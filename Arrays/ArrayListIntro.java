package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> list =new ArrayList<>(10);
//        list.add(23);
//        list.add(34);
//        list.add(54);
//        list.add(231);
//        list.add(65);
//        System.out.println( list.contains(54));//returns true or false whether the number is present in arraylst or not
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);
//        //to get a value at any index, use get fcn..they cannot be accessed like arrays
//        System.out.println(list.get(3));//4 is the index

        //creating multi dimensional array list
        ArrayList<ArrayList<Integer>> list2 =new ArrayList<>();
        //taking input for 2d array list
        for (int i = 0; i < 3; i++) {
            list2.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list2);
    }
}
