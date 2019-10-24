package Main;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reminder extends Alarm {
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.uuuu");
    private LocalDate date;


    @Override
    public void askInfo() {
        super.askInfo();
        System.out.println("Date> ");
        String strDate = Main.scan.next();
        date = LocalDate.parse(strDate, DATE_FORMAT);

    }
    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(TIME_FORMAT).contains(str);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTime(LocalDate date) {
        this.date = date;
    }

    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time = " + time.format(TIME_FORMAT) +
                ", date = " + date.format(DATE_FORMAT) +

                '}';
    }

    }