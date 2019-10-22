package Main;


public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        this.id = counter;

    }

    public abstract void askInfo();



    public int getId() {
        return id;
    }
    public boolean contains(String str) {
        String strID = Integer.toString(id);
        return strID.contains(str);
    }


    public abstract boolean contains(String str);
}








