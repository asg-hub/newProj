package Lesson_6;

import java.util.Date;

public class NoteMas {
    Note[] notes;

    //NoteMas(int col) {
    //this.notes = new Note[col];
    //}

    void add(String plan) {
        rebuildArray();
        Note note = new Note();
        note.addCurrentNote(plan);
        this.notes[this.notes.length - 1] = note;
    }

   void getNumNotes() {
        if(notes == null) {
            System.out.println("В книге нет записей!");

        }else {
            System.out.print(notes.length);
        }
    }

    void sortDesc() {

        boolean itSorted = false;
        Note buf;

        while (!itSorted) {
            itSorted = true;
            for (int i = 0; i < this.notes.length - 1; i++) {

                Date date1 = this.notes[i].getDate();
                Date date2 = this.notes[i + 1].getDate();

                if (date1.before(date2)) {
                    itSorted = false;
                    buf = this.notes[i];
                    this.notes[i] = this.notes[i + 1];
                    this.notes[i + 1] = buf;
                }


            }
        }
    }

    void sortInc() {
        boolean itSorted = false;
        Note buf;
        while (!itSorted) {
            itSorted = true;
            for (int i = 0; i < this.notes.length - 1; i++) {

                Date date1 = this.notes[i].getDate();
                Date date2 = this.notes[i + 1].getDate();

                if (date1.after(date2)) {
                    itSorted = false;
                    buf = this.notes[i];
                    this.notes[i] = this.notes[i + 1];
                    this.notes[i + 1] = buf;
                }


            }
        }
    }

    void rebuildArray() {
        if (this.notes == null) {
            this.notes = new Note[1];
        } else {
            Note[] tempNotes = this.notes;
            Note[] newNotes = new Note[tempNotes.length + 1];

            for (int i = 0; i < tempNotes.length; i++) {
                newNotes[i] = tempNotes[i];
            }
            this.notes = newNotes;
        }

    }

    void print() {
        if (notes == null) {
            System.out.println("В книге нет записей");
            return;
        }
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] == null) {
                continue;
            }
            System.out.print(i + ": ");
            this.notes[i].print();
            System.out.println();

        }
    }

    void dictionary(int numRec) {

        if (notes == null) {
            System.out.println("Ошибка. Записная книга пустая");
            return;
        }

        if (numRec > notes.length) {
            System.out.println("Введено слишком больше число записи книги (в книге " + notes.length +  " записей)");
            return;
        }


        String longString = notes[numRec-1].getPlan();


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


