package Sabina;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


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
                    default:
                        System.out.println("Error: Unknown command");

                }

    }

    }



    private static void showHelp() {
            System.out.println("Hello World!");
        }

    }



 /* MY IDEAS String cmd = askString("Please enter your command: (help / exit)");

        switch(cmd) {
            case "exit":
                return;
            case "help":
                showHelp();
                break;

        } */
