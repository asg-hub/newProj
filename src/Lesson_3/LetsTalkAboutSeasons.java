package Lesson_3;

import java.util.Scanner;

//Написать программу, в которой в консоль будет выводится название месяца и сезон, к которму этот месяц
//относится (написать с помощью if и с помощью switch)
public class LetsTalkAboutSeasons {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите порядковый номер месяца:");
        int numMonth = scan.nextInt();

        month(numMonth);
    }
    public static void month(int numMonth) {
        sayMonthWithIf(numMonth);
        sayMonthWithSwitch(numMonth);
    }
    public static void sayMonthWithSwitch(int numMonth) {

        System.out.println("Название месяца через метод Switch: ");
        switch (numMonth) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println("Март");
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println("Июль");
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println("Ноябрь");
            case 12 -> System.out.println("Декабрь");
            default -> System.out.println("Нет такого месяца...ошибка ввода");
        }

        System.out.println("Пора года методом Switch:");
        switch (numMonth) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Нет такой поры года...ошибка ввода");
        }
    }
    public static void sayMonthWithIf(int numMonth) {
        System.out.println("Название месяца через метод if: ");
        if (numMonth == 1) {
            System.out.println("Январь");
        } else if (numMonth == 2) {
            System.out.println("Февраль");
        } else if (numMonth == 3) {
            System.out.println("Март");
        } else if (numMonth == 4) {
            System.out.println("Апрель");
        } else if (numMonth == 5) {
            System.out.println("Май");
        } else if (numMonth == 6) {
            System.out.println("Июнь");
        } else if (numMonth == 7) {
            System.out.println("Июль");
        } else if (numMonth == 8) {
            System.out.println("Август");
        } else if (numMonth == 9) {
            System.out.println("Сентябрь");
        } else if (numMonth == 10) {
            System.out.println("Октябрь");
        } else if (numMonth == 11) {
            System.out.println("Ноябрь");
        } else if (numMonth == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Нет такого месяца...ошибка ввода");
        }

        //вывод сезона

        System.out.println("Пора года методом if:");
        if (numMonth == 1 || numMonth == 2 || numMonth == 12) {
            System.out.println("Зима");
        } else if (numMonth == 3 || numMonth == 4 || numMonth == 5) {
            System.out.println("Весна");
        } else if (numMonth == 6 || numMonth == 7 || numMonth == 8) {
            System.out.println("Лето");
        } else if (numMonth == 9 || numMonth == 10 || numMonth == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Нет такой поры года...ошибка ввода");
        }
    }
}
