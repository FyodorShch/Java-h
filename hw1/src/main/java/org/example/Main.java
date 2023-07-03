package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int l = 0; //Число, в цикле работающее как индекс массива m1
        int s = 0; //Число, в цикле работающее как индекс массива m2
        int i = new Random().nextInt(2000); //РАндомайзер чисел
        int[] m1 = new int[Short.MAX_VALUE - i]; // Массивы, куда сохраняются кратные n числа
        int[] m2 = new int[Short.MAX_VALUE - i]; // Массивы, куда сохраняются не кратные n числа
        System.out.println(i);
        int n = Integer.toBinaryString(i).length(); // Длина числа i в двоичном виде
        System.out.println(n);
        System.out.println("m1 = ");
        for (int k = i; k < Short.MAX_VALUE; k++) {
            if (k % n == 0) {
                m1[l] = k;
                l = l + 1;
            }
        }
        System.out.println(Arrays.toString(m1));
        System.out.println("m2 = ");
        for (int a = i; a > Short.MIN_VALUE; a--) {
            if (a % n != 0) {
                m2[s] = a;
                s = s + 1;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}