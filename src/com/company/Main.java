package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

	// write your code here
     double roomLength = 0.0;
     double roomWidth = 0.0;
     double roomArea = 0.0;
     double roomPerimeter = 0.0;

     //Length x Width = Area


        System.out.print("Enter the roomLength");
         roomLength = scnr.nextDouble();

        System.out.print("Enter the roomWidth");
        roomWidth = scnr.nextDouble();
     //roomArea = (24.5 * 20.0);

        roomArea = (roomLength * roomWidth);
        System.out.println("The room area is: " +  roomArea);

       //Calculate Room Perimeter  RP = length + length + width + width
        roomPerimeter = (roomLength + roomLength + roomWidth + roomWidth);
                System.out.print("The room perimeter is: " + roomPerimeter);


        return;

            }
}
