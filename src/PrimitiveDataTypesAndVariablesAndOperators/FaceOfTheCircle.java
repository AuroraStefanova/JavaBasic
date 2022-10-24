package PrimitiveDataTypesAndVariablesAndOperators;

import java.util.Scanner;

public class FaceOfTheCircle {
    public static void main(String[] arg){
        Scanner src = new Scanner(System.in);
        double radius = src.nextDouble();
        double p = 3.14;
        //face of Circle = p * r *r
        double faceOfCircle = (p *( radius * radius));

        System.out.println(faceOfCircle);

    }
}
