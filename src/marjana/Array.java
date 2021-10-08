package marjana;

import java.util.Scanner;

public class Array {
    static  void  max(int x[])
    {
        int max = 0;
        for (int i=0; i<x.length; i++){
            if(max < x [i]){
                max = x[i];
            }
        }
        System.out.println("Maximum number is: "+max);
    }

    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = input.nextInt();
        //Single Dimensional
        int a[] = new int[size];
        // char c[] = new char[size];

        // for character
        /* for(int i=0; i<size; i++){
            System.out.println("Enter the value for " +i);
            c[i] = input.next().charAt(0);
        }
         */
        //for int
        for(int i=0; i<size; i++){
            System.out.println("Enter the value for " +i);
            a[i] = input.nextInt();
        }
        max(a);
        /*
        a[0] = 12;
        a[1] = 4;
        a[2] = 9;
        a[3] = 11;
        a[4] = 60;
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);s
        } */
        /* for (char i: c)
        {
            System.out.println(i);
        }
         */

        //Multidimensional array
        int x[][] = new int[2][2];

//        int[][]y;
//        int []z[];
//        int [][]k;
    }
}
