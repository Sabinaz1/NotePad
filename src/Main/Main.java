package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> records = new ArrayList<>();


    public static void main(String[] args) {
        scan.useDelimiter("\n");
        System.out.println("Enter a command. Type 'help' for help.");
        for (; ; ) {
            System.out.println("> ");
            String cmd = scan.next();
            switch (cmd) {
                case "exit":
                    System.out.println("Goodbye!");
                    return;
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                case "find":
                    findRecords();
                    break;
                case "delete":
                    deleteRecords();
                    break;
                default:
                    System.out.println("Error: Unknown command");


            }

        }

    }


    private static void deleteRecords() {
        listRecords();
        System.out.print("Enter the ID of the record you would like to delete: ");
        int toDelete = scan.nextInt();
        for (int i = 0; i < records.size(); i++) {

            Record r = records.get(i);

            if (toDelete == r.getId()) {
                records.remove(i);
                break;
            }
        }


    }


    private static void listRecords() {
        for (Record r : records) {
            System.out.println(r);
        }
    }

    private static void createRecord() {
        System.out.print("type> ");
        String type = scan.next();
        switch (type) {
            case "person":
                createRecord(new Person());
                break;
            case "note":
                createRecord(new Note());
                break;
            case "alarm":
                createRecord(new Alarm());
                break;
            case "reminder":
                createRecord(new Reminder());
                break;
            default:
                System.out.println("Error: Unknown record type");
        }
    }



    private static void createRecord(Record r) {
        r.askInfo();
        records.add(r);
    }

    private static void showHelp() {
        System.out.println("The list of available commands: ...");
    }


    private static void findRecords() {
        System.out.print("substring> ");
        String str = scan.next();
        for (Record r : records) {
            if (r.contains(str)) {
                System.out.println(r);
            }
        }
    }
}














