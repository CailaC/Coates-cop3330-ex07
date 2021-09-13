package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Caila Coates
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.printf( "What is the length of the room in feet?" );
        int length = input.nextInt();

        System.out.printf( "What is the width of the room in feet?" );
        int width = input.nextInt();

        //f2 = square feet
        int f2 = length*width;
        //m2 = square
        double conversion = 0.09290304;
        double m2 = f2*conversion;

        System.out.printf( "You entered dimensions of %d feet by %d feet.\n", length, width );
        System.out.printf( "The area is\n%d square feet\n", f2);
        System.out.printf( "%.3f square meters", m2);



    }
}
