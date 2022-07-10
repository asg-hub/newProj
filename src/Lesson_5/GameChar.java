package Lesson_5;

import java.util.Random;
import java.util.Scanner;

public class GameChar {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        //всего 32 буквы в рус алфавите (без ё играем)

        int warm = 10;
        int cold = 15;
        int hot = 5;
        int wHot = 1;

        char ch = (char) random.nextInt(1072, 1103);
       // System.out.println("Загадали букву: " + ch);


        while (true) {
            System.out.println("Угадайте букву - введите ее в консоль");
            String humanString = scanner.next();
            char fff = humanString.toCharArray()[0];
            //System.out.println(fff + 0);

            char rang= 0;

            if (fff > ch) {
                rang = (char) (fff - ch);

            } else if (fff == ch) {
                System.out.println("ты угадал!");
                break;
            } else {
                rang = (char) (ch - fff);
            }

            if (rang >= wHot && rang <=hot) {
                System.out.println("Горячо - ты почти у цели");
            } else if (rang >= hot && rang <=warm) {
                System.out.println("Тепло");
            } else if (rang >= warm && rang <=cold) {
                System.out.println("холодно");
            } else {
                System.out.println("Очень холодно");
            }

        }

    }

}
