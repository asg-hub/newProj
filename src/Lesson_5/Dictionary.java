package Lesson_5;


import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {

        String longString;
        //longString = "сколько можно проверять одно и то же слово вот именно сколько можно повторять я вас спрашиваю";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинную строку:");
        longString = scanner.nextLine();
        String[] longStringArr = longString.split(" ");
        String[] countWords = new String[longStringArr.length];

        int wordInArr;

        for (int i = 0; i < longStringArr.length; i++) {

            wordInArr = 0;
            String findWord = longStringArr[i];

            if (findIndex(countWords, findWord) != -1) {

                continue;
            }
            System.out.print("Слово " + findWord);
            for (int j = 0; j < longStringArr.length; j++) {
                if (longStringArr[j].equals(findWord) == true) {
                    wordInArr += 1;

                }
                countWords[i] = findWord;
            }

            System.out.print(" " + wordInArr + " встречается два раза(раз)");
            System.out.println();

        }


    }

    private static int findIndex(String[] stringArr, String findWord) {

        int result = -1;
        for (int i = 0; i < stringArr.length; i++) {

            if (stringArr[i] != null && stringArr[i].equals(findWord) == true) {
                result = i;
                break;
            }
        }

        return result;
    }


}
