package com.company.library;

import java.util.Scanner;

public class libraryFunctions {
    public static int getInt(String prompt) {
        System.out.println(prompt);
        int myInput = -1;

        try {
            Scanner input = new Scanner(System.in);
            myInput = input.nextInt();
            return myInput;
        } catch (Exception e) {
            System.out.println(e);
        }
        return myInput;

    }


    public static double getDouble(Double prompt) {
        System.out.println(prompt);
        double doubleInput = -1;

        try {
            Scanner input = new Scanner(System.in);
            doubleInput = input.nextDouble();

        } catch (Exception e) {
            System.out.println(e);
        }
        return doubleInput;
    }


        }


