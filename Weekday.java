package Curs17.Weekday;

import java.util.Scanner;

public class Weekday {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("Number : ");
        int number = scr.nextInt();

        System.out.println(day(number));

    }

    public static String day(int number) {

        String day = " ";

        switch (number) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not a day";
        }

        return day;


    }
}
