package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> personRecord = new ArrayList<>();



        public static void main (String[] args) {
            scan.useDelimiter("\n");
            System.out.println("Enter a command. Type 'help' for help");
            for (; ;) {
                System.out.println(">");
                String cmd = scan.next();
                switch(cmd) {
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
                    default:
                        System.out.println("Error: Unknown command");

                }

    }

    }



    private static void findRecords() {
        for (str : personRecord) {
            System.out.println("true");
        }


    }


    private static void createRecord() {
        System.out.println("type> ");
        String type = scan.next();
        switch (type){
            case "person":
                createRecord(new Person());
                break;
            case "note":
                createRecord(new Note());
                break;
            case "alarm":
                createRecord(new Alarm());
                break;

            default:
                System.out.println("Unknown record type");
        }
    }






    private static void createRecord(Record r) {
            r.askInfo();
            personRecord.add(r);

    }

    private static void listRecords() {
        for (Record p : personRecord) {
         /*   System.out.printf("%d %s %s %s\n",
                    p.getId(),
                    p.getName(),
                    p.getSurname(),
                    p.getPhone()); */
            System.out.println(p);
        }
    }



    private static void showHelp() {
            System.out.println("Hello World!");
        }

    }



