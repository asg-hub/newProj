package Lesson_3;

public class SayHello {

    public static void main(String[] args) {
        int years = 55;
        String name = "Stas";
        String pol = "М"; //могут принимать значения "М" или "Ж"
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
