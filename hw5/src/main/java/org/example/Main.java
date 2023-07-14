//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.
package org.example;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static HashMap phones(HashMap<String, List<String>> phonebook, String clue, String NumOfPhone) {
        phonebook.computeIfAbsent(clue, k -> new ArrayList<>()).add(NumOfPhone);
        return phonebook;
    }

    public static void main(String[] args) throws IOException {
        Scanner iScanner = new Scanner(System.in);
        HashMap<String, List<String>> phonebook = new HashMap<>();
        while(true) {
            System.out.println("Введите имя пользователя и номер человека: ");
            phonebook = phones(phonebook, iScanner.nextLine(), iScanner.nextLine());
            System.out.println("Продолжить ввод? Yes/No");
            String usl = iScanner.nextLine();
            if(usl.toLowerCase().contains("n")) break;
        }
        System.out.println("Телефонная книга: ");
        phonebook.entrySet()
                .stream()
                .sorted((Map.Entry.comparingByValue((o1, o2) -> o2.size()- o1.size())))
                .forEach(System.out::println);
    }
}