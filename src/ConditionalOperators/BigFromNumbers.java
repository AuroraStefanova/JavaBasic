package ConditionalOperators;

import java.util.Scanner;

public class BigFromNumbers {
    public static void main(String[] arg){

        Scanner src = new Scanner(System.in);
        int firstNum = src.nextInt();
        //System.out.println(firstNum);
        int secondNum = src.nextInt();
        int thirdNum = src.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println("biggest num is: " + firstNum);
        }
        else if (secondNum > firstNum && secondNum > thirdNum){
            System.out.println("biggest num is: " + secondNum);
        }
        else {
            System.out.println("biggest num is: " + thirdNum);
        }
    }
}
