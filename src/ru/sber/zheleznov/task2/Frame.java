package ru.sber.zheleznov.task2;

import java.util.Scanner;

public class Frame {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int len = src.nextInt();
        int width = src.nextInt();

        String str = src.next();

        System.out.println((width - str.length()));
        if (len <= 2 || len % 2 == 0 || width - str.length() <= 1 || (width - str.length()) % 2 == 1) {

            System.out.println("Ошибка");
            return;
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == len - 1) {
                    System.out.print("*");
                } else if (i == len / 2){
                    if (j == 0 || j == width - 1) {
                        System.out.print("*");
                    }
                    if (j != (width - str.length()) / 2 - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print(str);
                        j = str.length() + ((width - str.length()) / 2 - 1);
                    }
                } else {
                    if (j == 0 || j == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
