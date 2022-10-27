package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;

    public class NumberDigits {
        public static void main(String[] args) {
            Fraction fraction1 = new Fraction();
            Fraction fraction2 = new Fraction(10, 10);
            System.out.println(fraction1);
            fraction2.printFraction();
            Fraction fraction3 = new Fraction(10, 10);
            fraction1 = fraction2.Subtraction(fraction3);
            System.out.println(fraction1);
            fraction2.multyOnkoef(2);
            System.out.println(fraction2);
            fraction1 = fraction2.multyFraction(fraction3);
            System.out.println(fraction1);
            fraction1 = fraction2.Divide(fraction3);
            System.out.println(fraction1);

        }

}