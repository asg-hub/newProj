package Lesson_3;

import java.util.Scanner;

//Написать программу, которая приветствует пользователя в зависимости от его пола и возраста (имя, пол и возраст
//задаются при старте программы)
public class SayHello {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int years = scan.nextInt();
        System.out.println("Введите имя:");
        String name = scan.next();
        System.out.println("Введите пол (могут принимать значения \"М\" или \"Ж\"):");
        String pol = scan.next();
        welcome(years, name, pol);
    }
    public static void welcome(int years, String name, String pol) {

        //локальные переменные
        String hi;
        String sHi;

        if ( years <= 12) {
            hi = getHiYoung(pol);
            sHi = "привет";
        } else if (years <= 25) {
            hi = getHiMiddle(pol);
            sHi = "возрадуйтесь";
        } else if (years <= 55) {
            hi = getHiAdult(pol);
            sHi = "приветствую";
        } else {
            hi = getHiOld(pol);
            sHi = "здравствуйте";
        }
        System.out.println(name + ",");
        System.out.println(sHi + ", " + hi);
    }
    public static String getHiOld(String pol) {
        if (pol == "М") {
            return "дедушка";
        } else if(pol == "Ж") {
            return "бабушка";
        } else {
            return "ошибка ввода значения пол...";
        }
    }
    public static String getHiAdult(String pol) {
        if (pol == "М") {
            return "мужчина";
        } else if (pol == "Ж") {
            return "женщина";
        } else {
            return "ошибка ввода значения пол...";
        }
    }
    public static String getHiMiddle(String pol) {
        if (pol == "М") {
            return "молодой человек";
        } else if (pol == "Ж") {
            return "девушка";
        } else {
            return "ошибка ввода значения пол...";
        }
    }
    public static String getHiYoung(String pol){

        if (pol == "М") {
            return "мальчик";
        } else if (pol == "Ж") {
            return "девочка";
        } else {
            return "ошибка ввода значения пол...";
        }

    }
}
