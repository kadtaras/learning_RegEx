package com.logosAcademy;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String word;
        List<String> aLetter = new ArrayList<String>();

        Pattern pat = Pattern.compile("^[a].*");

        do {
            word = sc.next();
            Matcher mat = pat.matcher(word);

            if (mat.matches()    /*mat.find() == true*/) {
                aLetter.add(word);
            }
        }
        while (!".".equals(word));


        for (String s : aLetter) {
            System.out.println(s);
        }

    }
}
