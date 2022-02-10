package com.logosAcademy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter few words or sentences: ");

        String [] str = scan.nextLine().split(" ");

        for(int i=0; i<str.length; i++){
            if(str[i].startsWith("a") && str[i].length() % 2 == 0){
                System.out.println(str[i]);
            }
        }


    }
}
