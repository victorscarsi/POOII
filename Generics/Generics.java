package com.ada.pooii.Generics;

public class Generics {
    public static void main(String[] args) {
        String a = "abacate";
        String b = "banana";
        System.out.println("Maior entre " + a + " e " + b + ": " + maior(a, b));
    }

    private static String maior(String primeira, String segunda) {
        return (primeira.compareTo(segunda) > 0) ? primeira : segunda;
    }
}
