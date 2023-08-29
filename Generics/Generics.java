package com.ada.pooii.Generics;

public class Generics {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println("Maior entre " + a + " e " + b + ": " + maior(a, b));
    }

    private static String maior(String primeira, String segunda) {
        if (primeira.hashCode() > segunda.hashCode()){
            return  primeira;
        } else {
            return segunda;
        }
    }
}
