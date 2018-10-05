package at.htl.mydate;

import java.util.Scanner;

/**
 * Informationen zu Enums: http://tutorials.jenkov.com/java/enums.html
 *               zu split: https://stackoverflow.com/a/3481842/9818338
 *   zur Ermittlung des Wochentages: https://de.wikipedia.org/wiki/Wochentagsberechnung#Programmierung
 */
public class MyDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;

        System.out.print("Geben Sie ein Datum in der Form <Tag>.<Monat>.<Jahr> ein: ");
        input = scanner.nextLine();

        String[] dateInput = input.split(".");
        String day = dateInput[0];
        String month = dateInput[1];
        String year = dateInput[2];

        String date[] = {day, month, year};

        for (int i = 0; i < date.length; i++) {
            System.out.println(date[i]);
        }
    }

    /**
     * Formatierung des Datums
     *
     * @return String, zB Samstag, 29. September 2018
     */
    public String formatDate() {

        return null;

    }

    /**
     *  Überprüfen, ob ein übergebenes Datum (other) jünger oder älter ist
     *
     * @param other
     * @return true, wenn this-Datum jünger als other-Datum ist
     *         false, wenn this-Datum jünger oder gleich other-Datum ist
     */
    public boolean isYoungerThan(MyDate other) {

        return false;

    }
}
