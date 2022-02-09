package com.logosAcademy;

public class Main {

    public static void main(String[] args) {

        String str = "I love Java more then my friend. Java is so beautiful.";

        boolean matches = str.matches(".*Java.*");
        System.out.println(matches);

        String s = str.replaceFirst("Java", "C#");
        System.out.println(s);

        String s2 = str.replaceAll("Java", "C#");
        System.out.println(s2);

    }
}
