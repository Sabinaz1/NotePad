package Main;

public class Note extends Record {
    private String text;

    @Override
    public void askInfo() {
        System.out.println("Text> ");
        text = Main.scan.next();
    }

    @Override
    public boolean contains(String str) {
            return super.contains(str)
                    || text.contains(str);
            }

    public String getText() {

        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + getId() +
                ", text='" + text + '\'' +
                '}';
    }


}

