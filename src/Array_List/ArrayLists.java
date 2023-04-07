package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
//        ArrayList<Integer> number = new ArrayList<Integer>();
//                  //adding elements
//        number.add(10);
//        number.add(20);
//        number.add(30);
//        number.add(40);
//            //System.out.println("ArrayList element: " + number);
//            System.out.print(number);
//           //for(int i : number){
//          //System.out.print(i+" ");
//            //}
//        System.out.println();
//        System.out.println("size = " + number.size());
//        number.remove(2); //Removing elements
//        System.out.println("after removing elements: " +number);


//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(0, 77);
//        number.add(1, 7);
//        number.add(2, 9);
//        number.add(3, 44);
//        number.add(4, 33);
//        System.out.println(number);
//        System.out.println(number.size());


//        Scanner sc = new Scanner(System.in);
//        ArrayList<String> arr = new ArrayList<String>();
//        System.out.println("enter number of item you add");
//        //Scanner input = new Scanner(System.in);
//        int numberOffItem = sc.nextInt();
//        for (int i = 0; i < numberOffItem; i++) {
//            String item = sc.next();
//            arr.add(item);
//
//        }
//        for (String itm : arr) {
//            System.out.println(itm);
//
//        }
//            System.out.println("\n");
//     //      arr.remove(0);
//      //  System.out.println(arr);

       Scanner sc = new Scanner(System.in);
       ArrayList<String> arr = new ArrayList<>();
        System.out.println("enter number of item");
        int numberOfItem = sc.nextInt();
        for (int i =0; i<numberOfItem;i++){
            String item = sc.next();
            arr.add(item);
        }
        for(String item : arr){
            System.out.println(item);
        }
    }
}


