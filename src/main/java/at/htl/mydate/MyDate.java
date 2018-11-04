package at.htl.mydate;

import static processing.core.PApplet.day;
import static processing.core.PApplet.month;
import static processing.core.PApplet.year;

/**
 * Informationen zu Enums: http://tutorials.jenkov.com/java/enums.html
 *               zu split: https://stackoverflow.com/a/3481842/9818338
 *   zur Ermittlung des Wochentages: https://de.wikipedia.org/wiki/Wochentagsberechnung#Programmierung
 */

public class MyDate {

    private int day;
    private int month;
    private int year;
    private Weekday weekday;

    public MyDate(String dateInput) {

        if (isValidDate(dateInput, day, month, year))

            // 2018-11-04-HM: String dateParts = dateInput.split("\\.");
            // => split muss dann nur einmal aufgerufen werden
            day = Integer.valueOf(dateInput.split("\\.")[0]);
        month = Integer.valueOf(dateInput.split("\\.")[1]);
        year = Integer.valueOf(dateInput.split("\\.")[2]);
    }

    private boolean isValidDate(String dateInput, int day, int month, int year) {

        boolean isValidDate;

        if (dateInput.split("\\.").length == 3){


        isValidDate = day <= 1 && month >= 1 && month <= 12 && year >= 0; // 2018-11-04-HM: day >= 1

        if (isValidDate) {

            if (year > year()) {

                isValidDate = false;

            } else if (year == year() && month > month()) {

                isValidDate = false;

            } else if (year == year() && month == month() && day > day()) {

                isValidDate = false;

            } else if (month == 1 && day > 31) {

                isValidDate = false;

            } else if ((month == 2 && day > 28 || (month == 2 && day > 29))) {

                isValidDate = false;

            } else if (month == 3 && day > 31) {

                isValidDate = false;

            } else if (month == 4 && day > 30) {

                isValidDate = false;

            } else if (month == 5 && day > 31) {

                isValidDate = false;

            } else if (month == 6 && day > 30) {

                isValidDate = false;

            } else if (month == 7 && day > 31) {

                isValidDate = false;

            } else if (month == 8 && day > 31) {

                isValidDate = false;

            } else if (month == 9 && day > 30) {

                isValidDate = false;

            } else if (month == 10 && day > 31) {

                isValidDate = false;

            } else if (month == 11 && day > 30) {

                isValidDate = false;

            } else if (month == 12 && day > 31) {

                isValidDate = false;
            }

        }

    } else { // 2018-11-04-HM: unnötig, da enthaltener Code nur durchlaufen wird, wenn isValidDate == false
        isValidDate = false;
    }
        return isValidDate;
}

    /**
     * Formatierung des Datums
     *
     * @return String, zB Samstag, 29. September 2018
     */

    public String formatDate() {

        String formatDate = "";
        String weekday = "";
        String month = getMonthNumber();

        switch (getWeekday()){
            case MONDAY: weekday = "Montag";
                break;
            case TUESDAY: weekday = "Dienstag";
                break;
            case WEDNESDAY: weekday = "Mittwoch";
                break;
            case THURSDAY: weekday = "Donnerstag";
                break;
            case FRIDAY: weekday = "Freitag";
                break;
            case SATURDAY: weekday = "Samstag";
                break;
            case SUNDAY: weekday = "Sonntag";
                break;
        }

        formatDate = weekday + ", " + day + ". " + month + " " + year;


        return formatDate;

    }

    // 2018-11-04-HM: Funktinonsname irreführend => getMonthName wäre besser
    private String getMonthNumber() {
        String monthString = "";

        switch (month) {

            case 1: monthString = "Jänner";
                break;
            case 2: monthString = "Februar";
                break;
            case 3: monthString = "März";
                break;
            case 4: monthString = "April";
                break;
            case 5: monthString = "Mai";
                break;
            case 6: monthString = "Juni";
                break;
            case 7: monthString = "Juli";
                break;
            case 8: monthString = "August";
                break;
            case 9: monthString = "September";
                break;
            case 10: monthString = "Oktober";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "Dezember";
                break;

        }
        return monthString;
    }

    /**
     *  Überprüfen, ob ein übergebenes Datum (other) jünger oder älter ist
     *
     * @param other
     * @return true, wenn this-Datum jünger als other-Datum ist
     *         false, wenn this-Datum jünger oder gleich other-Datum ist
     */

    public boolean isYoungerThan(MyDate other) {

        return false; // 2018-11-04-HM: TODO

    }
    //region Getter
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Weekday getWeekday() {
        return weekday;
    }
    //endregionn
}