package Lesson_6;

public class NoteMas {
    Note[] notes;
    NoteMas(int col) {
        this.notes = new Note[col];
    }
    void add(String plan, int index) {
        Note note = new Note();
        note.data = "test";
        note.plan = "test";
        this.notes[index] = note;
    }
    void print(){
        for (int i = 0; i < this.notes.length; i++) {
            if (this.notes[i] == null) {
                continue;
            }
            //System.out.println(this.notes.length);
            System.out.print(i + ": ");
            System.out.print(this.notes[i].data);
            System.out.print(" - ");
            System.out.print(this.notes[i].plan);
            System.out.println();
        }
    }
    void sort(){
        System.out.println("sorted");
    }
}
