package ru.sber.zheleznov.task1;

import java.util.Scanner;

public class Kth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        System.out.println(getN(k + 1));
    }

    public static long getN(long position) {
        int a = 1;
        int s = 9;
        long q = s;
        long p = 1;
        long rankMult = 10;

        while (position % q < position && (double) position / q > 1) {
            position -= q;
            a = a + 1;
            q = (long) s * (a) * (p *= rankMult);
        }

        return getV(a, position, q, rankMult);
    }

    private static long getV(int a, long pos, long q, long rankMult) {
        if (a == 1) {
            return pos;
        }
        q /= 9;
        if (pos % a == 1) {
            return pos / q + 1;
        }
        pos %= q;
        q /= rankMult;
        for (int i = 2; i < a; i++) {
            if (pos % a == i) {
                return (pos / q);
            }
            pos %= q;
            q /= rankMult;
        }
        if (pos % a == 0) {
            return (pos / a) - 1;
        }
        return 0;
    }
}
