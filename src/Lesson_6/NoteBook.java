package Lesson_6;

import java.util.Scanner;

public class NoteBook {

    public static void main(String[] args) {
        NoteMas noteMas = new NoteMas();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие, которое хотите сделать:");
            System.out.println("1 - если хотите добавить новую запись в записную книжку");
            System.out.println("2 - если хотите вывести все записи на экран");
            System.out.println("3 - отсортировать по убыванию даты");
            System.out.println("4 - отсортировать по возрастанию даты");
            System.out.println("5 - если хотите завершить работу программы");
            int res = scanner.nextInt();
            if (res == 1) {
                System.out.println("Ок. Введите запись, которую выхотите добавить в книгу:");
                Scanner scanner2 = new Scanner(System.in);
                String newNote = scanner2.nextLine();
                noteMas.add(newNote);
            } else if (res == 2) {
                System.out.println("Ок. Смотри что у нас есть:");
                noteMas.print();
            } else if (res == 3) {
                System.out.println("Ок. Сортиркуем по убыванию даты");
                noteMas.sortDesc();
            } else if (res == 4) {
                System.out.println("Ок. Сортиркуем по возрастанию даты");
                noteMas.sortInc();
            } else if (res == 5) {
                System.out.println("Хорошо - прощай!");
                break;
            } else {
                System.out.println("Вы ошиблись - попробуйте снова");
            }

        }

    }
}
