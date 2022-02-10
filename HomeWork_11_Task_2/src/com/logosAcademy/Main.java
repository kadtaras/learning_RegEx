package com.logosAcademy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");


        Pattern pattern = Pattern.compile("^(.+)@gmail.com$");


        for (String email : arr) {
            Matcher matcher = pattern.matcher(email);

            if (matcher.matches()) {
                System.out.println(email);
            }
        }
    }}
