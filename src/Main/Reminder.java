package Main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Reminder extends Alarm implements Expirable {
    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.uuuu");
    private LocalDate date;
    private boolean dismissed = false;




    @Override
    public boolean isExpired() {
        if (dismissed) {
            return false;
        }
        var dt = LocalDateTime.of(date, getTime());
        return LocalDateTime.now().isAfter(dt);

    }

    @Override
    public void dismiss() {

           dismissed = true;


    }



    @Override
    public void askInfo() {
        super.askInfo();
        date = Asker.askDate("Date");


    }
    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || date.format(Asker.TIME_FORMAT).contains(str);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTime(LocalDate date) {
        this.date = date;
    }

    public String toString() {
        return "Reminder{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time = " + getTime().format(Asker.TIME_FORMAT) +
                ", date = " + date.format(Asker.DATE_FORMAT) +

                '}';
    }

    }