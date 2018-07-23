package sg.edu.rp.c346.todolist;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calendar date;



    private boolean isImportant;

    public ToDoItem(String title, Calendar date, boolean isImportant) {
        this.title = title;
        this.date = date;
        this.isImportant = isImportant;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", date=" + getDateString() +
                ", isImportant="+ isImportant +
                '}';
    }
}
