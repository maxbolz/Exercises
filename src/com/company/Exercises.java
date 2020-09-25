package com.company;

public class Exercises {
    public static int digitSwapper(int input) {

        int otherDigits = (input % 1000) / 100;
        int secondLastDigit = (input % 100) / 10;
        int lastDigit = (input % 10);
        int output = otherDigits*100 + lastDigit*10 + secondLastDigit;
        return output;
    }

    public static void timeLeft(int currHour, int currMin, int depHour, int depMin) {

        int hourDiff = (depHour - currHour) * 60;
        int minDiff = depMin - currMin;
        int timeWait = hourDiff + minDiff;
        int hourFinal = timeWait / 60;
        int minFinal = timeWait % 60;

        System.out.println("\nYou will have to wait " + hourFinal + " hours and " + minFinal + " minutes.");

    }

    public static int dayOfWeek(int daysOfWeek1, int day) {

        int result = (daysOfWeek1 + day - 1) % 7;

        // Subtract 1 because January 1st is represented as 1, not 0.

        return result;

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 6;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        input = 381;
        output = digitSwapper(input);
        System.out.println(input + " " + output);

        timeLeft(1, 34, 8, 20);
        timeLeft(1, 15, 4, 36);


        System.out.println(dayOfWeek(0, 1));
        System.out.println(dayOfWeek(0, 14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1, 24));
        System.out.println(dayOfWeek(2, 1));

    }

}