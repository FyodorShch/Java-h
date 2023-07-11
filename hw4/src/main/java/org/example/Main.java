//Организовать ввод и хранение данных пользователей. ФИО возраст, пол и выход из режима ввода информации
//вывод в формате Фамилия И.О. возраст пол
//добавить возможность выхода или вывода списка отсортированного по возрасту!)
//*реализовать сортировку по возрасту с использованием индексов
//*реализовать сортировку по возрасту и полу с использованием индексов
package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> patronymic = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        ArrayList<Integer> id = new ArrayList<>();
        while (true) {
            System.out.print("Введите имя: ");
            name.add(scanner.nextLine());
            System.out.print("Введите фамилию: ");
            surname.add(scanner.nextLine());
            System.out.print("Введите отчество: ");
            patronymic.add(scanner.nextLine());
            System.out.print("Введите возраст: ");
            age.add(Integer.valueOf(scanner.nextLine()));
            System.out.print("Введите пол: ");
            gender.add(scanner.nextLine());
            id.add(gender.size() - 1);

            System.out.println("Продолжить ввод? Yes/No");
            String usl = scanner.nextLine();
            if (usl.toLowerCase().contains("n")) break;
        }

        for (int i = 0; i < name.size(); i++) {
            System.out.printf("name = %s, surname = %s, patronymic = %s, age = %s, gender = %s", name.get(i), surname.get(i), patronymic.get(i), age.get(i), gender.get(i));
            System.out.println();
        }


        System.out.println("Вывести сортировку по возрасту? Yes/No");
        String usl = scanner.nextLine();
        if (usl.toLowerCase().contains("y")) {
            id.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {

                    return age.get(o1) - age.get(o2);
                }

            });

            for (int i = 0; i < id.size(); i++) {
                System.out.printf("name = %s, surname = %s, patronymic = %s, age = %s, gender = %s", name.get(id.get(i)), surname.get(id.get(i)), patronymic.get(id.get(i)), age.get(id.get(i)), gender.get(id.get(i)));
                System.out.println();
            }

        }
    }
}
