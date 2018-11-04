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

        MyDate myDate = new MyDate(dateInput); // 2018-11-04-HM: Exception bei Eingabe von "quit"

        while (!(dateInput.equals("quit"))) {
            // 2018-11-04-HM: TODO


        }



    }
}
