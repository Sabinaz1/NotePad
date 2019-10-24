package Main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Alarm extends Note {
    public static final DateTimeFormatter TIME_FORMAT = DateTimeFormatter.ofPattern("HH:mm");
    public LocalTime time;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.println("Time> ");
        String strTime = Main.scan.next();
        time = LocalTime.parse(strTime, TIME_FORMAT);
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.format(TIME_FORMAT).contains(str);
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time = " + time.format(TIME_FORMAT) +

                '}';
    }






    }


