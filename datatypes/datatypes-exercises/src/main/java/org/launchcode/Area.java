package org.launchcode;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        Double lengthRectangle = input.nextDouble();

        System.out.println("What is the width of the rectangle?");
        Double widthRectangle = input.nextDouble();

        Double area = lengthRectangle * widthRectangle;
        System.out.println("The area of the rectangle is " + area);
    }
}
