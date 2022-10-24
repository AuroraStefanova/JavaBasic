package Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] arg){
        Scanner scr = new Scanner(System.in);
        int number = scr.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++){
            sum = sum + i;

        }
        System.out.println(sum);
    }
}
