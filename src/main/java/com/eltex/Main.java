package com.eltex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final var scanner = new Scanner(System.in);

        System.out.println("Введите валюту: 1 – RUB, 2 – BYN, 3 – KZT");

        final var userCurrency = scanner.nextInt();

        final String currencySymbol;

        if (userCurrency == 1) {
            currencySymbol = "₽";
        } else if (userCurrency == 2) {
            currencySymbol = "Br";
        } else if (userCurrency == 3) {
            currencySymbol = "₸";
        } else {
            System.out.println("У нас нет такой валюты");
            return;
        }

        System.out.println("Введите сумму покупок за прошлый год");

        final var clientYearlyPurchases = scanner.nextInt();
        final var discount = 0.02;
        final var discountStart = 3_000;

        final double totalDiscount;
        if (clientYearlyPurchases >= discountStart) {
            totalDiscount = clientYearlyPurchases * discount;
        } else {
            totalDiscount = 0;
        }

        System.out.printf("За прошлый год вы бы сэкономили с подпиской %s %s", totalDiscount, currencySymbol);
    }
}