import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda" };
//        System.out.println(cars[2]);
//        System.out.println(cars.length);


//        int[] number = {5,15,25,35,45};
//       System.out.println(number[3]);
//        System.out.println(number.length);


//          //loop
//        for (int i = 0; i < 10; i++) {
//            System.out.println("My name is Manotosh");


           //for each loop
//        String [] cars = {"Tata", "Volvo","Toyota", "BMW", "Ford" };
//        for(String x : cars){
//            System.out.println(x);

            //for each loop
//        int[] num = {10,20,30,40,50,60,70,80,90,100};
//        int sum =0;
//        for(int x : num){
//            sum = sum + x;
//        }
//        System.out.println(sum);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Plz enter 10 number: ");
//        double[] doubleArray = new double[10];
//        double sum = 0;
//        for (int i = 0; i < doubleArray.length; i++) {
//            doubleArray[i] = input.nextDouble();
//        }
//        for (int i = 0; i < doubleArray.length; i++) {
//            sum = sum + doubleArray[i];
//        }
//        System.out.println("The Sum is: " + sum);
//        double avg = sum / doubleArray.length;
//        System.out.println("The avarage is: " + avg);
//    }


//        Scanner input = new Scanner(System.in);
//        System.out.println("enter array size: ");
//        int size = input.nextInt();
//        double[] doubleArray = new double[size];
//        System.out.println(" plz enter number");
//        double sum = 0;
//        for (int i = 0; i < doubleArray.length; i++) {
//            doubleArray[i] = input.nextDouble();
//        }
//        for (int i = 0; i < doubleArray.length; i++) {
//            sum = sum + doubleArray[i];
//        }
//        System.out.println("The sum is: " + sum);
//        double avg = sum / doubleArray.length;
//        System.out.println(" The Avarage is: " + avg);


//        Scanner input = new Scanner(System.in);
//        System.out.print("Plz enter 5 number: ");
//        double[] doubleArray = new double[5];
//        double sum = 0;
//        for (int i = 0; i < doubleArray.length; i++) {
//            doubleArray[i] = input.nextDouble();
//        }
//        double max = doubleArray[0];
//        double min = doubleArray[0];
//        for(int i = 1; i<doubleArray.length; i++){
//            if(max<doubleArray[i]){
//                max = doubleArray[i];
//            }
//            if(min>doubleArray[i]){
//                min = doubleArray[i];
//            }
//        }
//        System.out.println("Max value: " +max);
//        System.out.println("Min value: " +min);


        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Array Size");
        int size = input.nextInt();
        int[] intArray = new int[size];
        for (int i = 0; i < intArray.length; i++) {
            int value = input.nextInt();
            intArray[i] = value;
            System.out.println(i + " Value " + value);

//        Scanner input = new Scanner(System.in);
//        int[] intArray = new int[2];
//        System.out.println("Enter value");
//            //Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < intArray.length; i++) {
//            int value = input.nextInt(); // or intArray[i] = input.nextInt();
//            intArray[i] = value;      //
//            System.out.println("Manotosh");


//        int[] intArray = new int[2];
//        System.out.println("Enter value");
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i] = input.nextInt(); //or int value = input.nextInt(); // intArray[i] = value;
//            System.out.println("MM");
        }
    }
}



