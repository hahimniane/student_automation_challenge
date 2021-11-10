package udemy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter amount of students:");
     int amountOfstudents=scanner.nextInt();
     scanner.nextLine();

      //first index is student name;
        String[][]array=new String[amountOfstudents][amountOfstudents];

 for (int i=0;i<array.length;++i){
     System.out.println("Enter student name:");
     String studentName=scanner.nextLine();

     scanner.nextLine();
     array[i][0]= studentName;
 }

        for (int i=0;i<array.length;++i){
            System.out.println("Enter grade");
            int grade=scanner.nextInt();
            scanner.nextLine();
            array[0][i]= String.valueOf(grade);
            scanner.nextLine();
        }
        System.out.println("Students names are:");
 for (int i=0;i<array.length;++i) {
     for (int j = 0; j < array.length; ++j) {
         System.out.println(array[0][0] + array[0][1]);
         System.out.println();
     }
     //-----------------------------------------//
// for (int i=0;i<array.length;++i){
//     System.out.println("Enter grade");
//     int grade=scanner.nextInt();
//     scanner.nextLine();
//     array[0][i]= String.valueOf(grade);
//     scanner.nextLine();
// }
//        System.out.println("Students grades  are:");
//        for (int i=0;i<array.length;++i){
//            int j=1;
//            System.out.print(array[i][j-1]);
//            System.out.println(array[i][j]);
//++j;
//        }
//
////        for (int i=0;i<array.length;++i){
////            System.out.print(array[i][0]+" ");
////            System.out.println(array[0][i]);
////            System.out.println("");
////        }
////        System.out.println(array[0][0]+" "+array[0][1]);
////        System.out.println(array[1][0]+" "+array[1][0]);
//
//    }
//}
 }}}