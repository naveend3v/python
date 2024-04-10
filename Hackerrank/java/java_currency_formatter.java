// https://www.hackerrank.com/challenges/java-currency-formatter/problem
// Java Currency Formatter

import java.util.*;
import java.text.*;

// Change below class name "java_currency_formatter" to "Solution" when running this code in HackerRank submission

public class java_currency_formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}