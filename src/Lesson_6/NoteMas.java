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
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] == null) {
                continue;
            }
            System.out.print(i + ": ");
            this.notes[i].print();
            System.out.println();
            //System.out.println(this.notes.length);
//            System.out.print(i + ": ");
//            System.out.print(this.notes[i].data);
//            System.out.print(" - ");
//            System.out.print(this.notes[i].plan);
//            System.out.println();
        }
    }

    void sort() {
        System.out.println("sorted");
    }
}
