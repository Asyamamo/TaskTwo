package com.company;
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner( System.in );
    private String input;

    public static void main(String[] args) {
        System.out.println("input the patient's surname name:");
        String surname = scanner.next();
        System.out.println("input the patient's name:");
        String name = scanner.next();
        System.out.println("input patient's last name:");
        String last = scanner.next();
        System.out.println("input patient's month of birth:");
        String month = scanner.next();
        System.out.println("input patient's date of birth:");
        int date = scanner.nextInt();
        System.out.println("input patient's year of birth:");
        int year = scanner.nextInt();
        System.out.println("patient's  date of birth:" + date + month + year);
        int age = 2017 - year;
        System.out.println("input patient's height:");
        float height = scanner.nextInt();
        System.out.println("input patient's weight:");
        float weight = scanner.nextInt();
        float BMI = weight / height;
        if (age >= 18)
            System.out.println("according to age antibiotic dose from 650ml increasing.");
        else
            System.out.println("antibiotic dosge under 650ml.");
        while (BMI <= 0.26) {
            System.out.println("patient is under weight antibiotic dosge under 650ml.");
            break;
        }
        System.out.println("patient's surname:" + surname);
        System.out.println("patient's  name:" + name);
        System.out.println("patient's last:" + last);
        System.out.println("patient's  date of birth:" + date + month + year);
        System.out.println("patient's age:" + age);
        System.out.println("patient's BMI:" + BMI);
    }
}


