package Main;

public class Alarm extends Note {
    private String time;

    @Override
    public void askInfo() {
        super.askInfo();
        System.out.println("Time> ");
        time = Main.scan.next();
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str)
                || time.contains(str);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + getText() + '\'' +
                ", time = " + getTime() +

                '}';
    }






    }


