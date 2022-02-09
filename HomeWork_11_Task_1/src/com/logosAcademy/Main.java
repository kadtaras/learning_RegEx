package com.logosAcademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter few words with first later \"a\" and not \"a\"");


        List<String> myList = new ArrayList<>();
        String str = scan.nextLine();
        myList.add(str);

        Pattern pattern = Pattern.compile("^a");

        List<String> myList2 = new ArrayList<>();

        for (int i=0; i<myList.size(); i++) {
            Matcher matcher = pattern.matcher(myList.get(i));

            if (matcher.find() == true) {
                myList2.add(myList.get(i));
            }
            System.out.println(myList2.get(i));
        }

        System.out.println(myList2);

    }
}
