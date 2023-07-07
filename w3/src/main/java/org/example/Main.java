package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> Chisla = new ArrayList<>(11); // Список для рандомных чисел
        ArrayList<Integer> ReplacedChisla = new ArrayList<>(Chisla.size()); // Список для чётных чисел
        int schmin = 502; //счётчик для поиска минимума
        int schmax = 0; // счётчик для поиска максимума
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            Chisla.add(new Random().nextInt(500) + 1);
        }
        System.out.print("Неотформатированный список: ");
        System.out.println(Chisla);
        for (int j = 0; j < Chisla.size(); j++) { //Записывание чисел в список ReplacedChisla
            if (Chisla.get(j) % 2 == 0) {
                ReplacedChisla.add(Chisla.get(j));
            }
            sum += Chisla.get(j);
        }
        for (int k = 0; k < Chisla.size(); k++) { // цикл для поиска максимума и минимума
            if (Chisla.get(k) < schmin) {
                schmin = Chisla.get(k);
            }
            if (Chisla.get(k) > schmax) {
                schmax = Chisla.get(k);
            }
        }
        System.out.print("Максимальное значение равно: ");
        System.out.println(schmax);
        System.out.print("Минимальное значение равно: ");
        System.out.println(schmin);
        System.out.print("Среднее значение равно: ");
        System.out.println(sum/ Chisla.size());

        Chisla.removeAll(ReplacedChisla);
        System.out.print("Список без чётных чисел: ");
        System.out.println(Chisla);
    }
}