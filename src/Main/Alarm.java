package Main;

import java.time.LocalDate;
import java.time.LocalTime;

public class Alarm extends Note implements Expirable {
    private LocalTime time;
    private LocalDate dismissedAt;

    @Override
    public void askInfo() {
        super.askInfo();
        time = Asker.askTime("Time");
    }



    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.format(Asker.TIME_FORMAT).contains(str);
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
                ", time = " + time.format(Asker.TIME_FORMAT) +

                '}';
    }

    @Override
    public boolean isExpired() {
        if (LocalDate.now().equals(dismissedAt)) {
        //if (dismissedAt.equals(LocalDate.now())) { 2nd version (simply changing places)
            return false;
        }
        return LocalTime.now().isAfter(time);
    }

    @Override
    public void dismiss() {
        dismissedAt = LocalDate.now();



    }
}


