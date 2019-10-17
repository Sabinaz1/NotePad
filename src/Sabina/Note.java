package Sabina;

public class Note extends Record {
    private String text;

    public void askText() {
        System.out.println("Text>");
        text = Main.scan.next();
    }

    public String getText() {
        return text;
    }

    public void setText() {
        this.text = text;
    }



}

