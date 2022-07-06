package Lesson4;


import java.util.Random;
import java.util.Scanner;

public class MyNewGame {
    static String charEmrty = "H";
    static String charX = "X";
    static String charO = "O";

    public static void main(String[] args) {

        System.out.println("Человек играет крестиком");
        System.out.println("Искуственный интеллект играет ноликом");
        String[][] gameArray = new String[3][3];

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        //инициализация "поля"

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameArray[i][j] = charEmrty;
            }
        }

        print(gameArray);

        boolean turnHuman = true;
        while (true) {
            if (turnHuman) {
                System.out.println("Уважаемый человек, введите координаты (строка, колонка):");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                x -= 1; //приводим к индексам
                y -= 1;
                if (coordinatesСorrect(x, y) == false) {
                    System.out.println("Введены не корректные данные. Попобуйте еще раз...");
                    continue; // сбрасывает цикл
                }
                if (callIsFuul(gameArray, x, y) == false) {
                    gameArray[x][y] = charX;

                    print(gameArray);
                    if (itsWin(gameArray, charX)) {
                        System.out.print("Победил ");
                        if (turnHuman) {
                            System.out.println("человек");
                        } else {
                            System.out.println("компьтер");
                        }
                        break;
                    }

                    if (gameIsFull(gameArray)) {
                        System.out.println("Поле заполнено - игра окончена!");
                        break;
                    }
                    turnHuman = false; //передаем ход компу
                } else {
                    System.out.println("Данная ячейка занята - попробуйте еще раз");
                }
            } else {
                int x = random.nextInt(3);
                int y = random.nextInt(3);
                System.out.println(x);
                System.out.println(y);
                if (coordinatesСorrect(x, y) == false) {
                    continue;
                }
                if (callIsFuul(gameArray, x, y) == false) {
                    //System.out.println("кор");
                    gameArray[x][y] = charO;

                    print(gameArray);

                    if (itsWin(gameArray, charO)) {
                        System.out.print("Победил ");
                        if (turnHuman) {
                            System.out.println("человек");
                        } else {
                            System.out.println("компьтер");
                        }
                        break;
                    }

                    if (gameIsFull(gameArray)) {
                        System.out.println("Поле заполнено - игра окончена!");
                        break;
                    }
                    turnHuman = true; //передаем ход человеку
                } else {
                   // System.out.println("не кор");
                    continue;
                }
            }
        }
    }

    private static boolean itsWin(String[][] gameArray, String charWin) {

        for (int i = 0; i < 3; i++) {
            if ((gameArray[i][0] == charWin && gameArray[i][1] == charWin && gameArray[i][2] == charWin)
                    || (gameArray[0][i] == charWin && gameArray[1][i] == charWin && gameArray[2][i] == charWin)) {
                return true;
            }
        }
        if ((gameArray[0][0] == charWin && gameArray[1][1] == charWin && gameArray[2][2] == charWin)
                || (gameArray[2][0] == charWin && gameArray[1][1] == charWin && gameArray[0][2] == charWin)) {
            return true;
        }

        return false;

    }

    private static boolean gameIsFull(String[][] gameArray) {

        Boolean gameFull = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameArray[i][j].equals(charEmrty) == true) {
                    gameFull = false;
                }
            }
        }

        return gameFull;
    }

    private static boolean coordinatesСorrect(int x, int y) {
        if (x >= 0 && x <= 2 && y >= 0 && y <= 2) {
            return true;
        }
        return false;
    }

    //проверка на занятость ячейки
    private static boolean callIsFuul(String[][] gameArray, int x, int y) {

        if (gameArray[x][y].equals(charEmrty) == true) {
            return false;
        }
        return true;
    }

    private static void print(String[][] gameArray) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(gameArray[i][j] + " ");
            System.out.println();
        }
    }
}
