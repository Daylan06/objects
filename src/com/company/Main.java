package com.company;

import com.company.library.libraryFunctions;
import com.company.objects.fish;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    static ArrayList<fish> fishList = new ArrayList<>();


    public static void main(String[] args) {
        //  int getInt = libraryFunctions.getInt("Please type in a number");
       // double getDouble = libraryFunctions.getInt("Please type in a number");


        fish myfish = new fish("69","the prophet","unknown","69","69.69","2.00","humans",);
        System.out.println(myfish.getName());
        fishList.add(myfish);
        System.out.println(fishList.get(1).getName());
    }
}

