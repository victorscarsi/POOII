package com.ada.pooii;

import java.math.BigInteger;

public class TesteDeLimites {

    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MAX_VALUE + 1);
        System.out.println(new BigInteger("9223372036854775807999999999").add(BigInteger.ONE));
        for (double i = 0; i<1; i+=0.1) {
            System.out.println(i);
        }
    }
}
