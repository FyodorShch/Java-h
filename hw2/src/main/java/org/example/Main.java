package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "SELECT * FROM students WHERE";
        Scanner scanner = new Scanner(System.in);

        System.out.println("name: ");
        String name = scanner.nextLine();
        System.out.println("country: ");
        String country = scanner.nextLine();
        System.out.println("city: ");
        String city = scanner.nextLine();
        System.out.println("age: ");
        String age = scanner.nextLine();

        String data = String.format("%s name = '%s', country = '%s', city = '%s', age = '%s'", question, name, country, city, age);

        String[] a = data.split(", ");
        if (name.isEmpty()) {
            StringBuilder builder = new StringBuilder(a[0]);
            a[0] = builder.replace(builder.indexOf("name"), builder.length(), "").toString();
        }
        if (country.isEmpty()) a[1] = "";
        else if (!a[0].isEmpty()) a[1]= " " + a[1];
        if (city.isEmpty()) a[2]="";
        else if (!a[0].isEmpty() || !a[1].isEmpty()) a[2]= ", " + a[2];
        if (age.isEmpty()) a[3] = "";
        else if (!a[0].isEmpty() || !a[1].isEmpty() || !a[2].isEmpty()) a[3]= ", " + a[3];

        data = String.join("",a);
        System.out.println(data);
    }
}