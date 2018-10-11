package at.htl.mydate;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String dateInput;
        int counter = 1;

        System.out.println("Date-Manager\n" +
                           "============" +
                           "\n\n");

        System.out.print("Geben Sie das "+ counter +". Datum in der Form <Tag>.<Monat>.<Jahr> ein: ");
        dateInput = scanner.nextLine();

        MyDate myDate = new MyDate(dateInput);

        while (!(dateInput.equals("quit"))) {



        }



    }
}
