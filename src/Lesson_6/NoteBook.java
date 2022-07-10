package Lesson_6;

public class NoteBook {

    public static void main(String[] args) {
        NoteMas noteMas = new NoteMas(10);

        noteMas.add("test", 0);
        noteMas.add("test", 1);
        noteMas.add("test", 2);

        noteMas.sort();
        noteMas.print();
    }
}
