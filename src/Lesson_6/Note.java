package Lesson_6;

import java.util.Date;

public class Note {

    private String plan;
    private Date date;
    public String getPlan() {
        return plan;
    }

    public Date getDate() {
        return date;
    }

    void addCurrentNote(String plan){
        Date date = new Date();
        this.date = date;
        this.plan = plan;
    }
    void print() {
        System.out.print(this.date);
        System.out.print(" ");
        System.out.print(this.plan);
    }
}
