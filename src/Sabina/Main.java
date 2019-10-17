package Sabina;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final Scanner scan = new Scanner(System.in);
    static ArrayList<Record> personRecord = new ArrayList<>();



        public static void main (String[] args) {
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
                    case "note":
                        printNote();
                    case "list":
                        listRecords();
                        break;
                    default:
                        System.out.println("Error: Unknown command");

                }

    }

    }

    private static void printNote() {
        for (Record n : personRecord) {
            System.out.println(n);
        }
    }

    private static void createNote() {
        System.out.println("note> ");
        String type = scan.next();
        Note n = new Note();
        n.setText();
        personRecord.add(n);

    }


    private static void createRecord() {
        System.out.println("type> ");
        String type = scan.next();
        switch (type){
            case "person":
                createPerson();
                break;
            default:
                System.out.println("Unknown record type");
        }
    }

    private static void createPerson() {
        Person p = new Person();
        p.askInfo();

        personRecord.add(p);


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



