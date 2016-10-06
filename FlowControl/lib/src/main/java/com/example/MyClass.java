package com.example;

public class MyClass {
    public static void main(String[] args) {
        boolean awake = false;
        double timeOfDay = 8.30;
        boolean breakfastEaten = false;
        boolean lunchEaten = false;
        boolean dinnerEaten = false;
        boolean writingCode = false;

        while (timeOfDay > 8.00 && timeOfDay < 22.00) {
            awake = true;

            if (awake && timeOfDay < 10) {
                if (!breakfastEaten) {
                    writingCode = false;
                    breakfastEaten = true;
                } else {
                    writingCode = true;
                }
            }

            if (awake && !breakfastEaten && timeOfDay < 10) {
                writingCode = false;
                breakfastEaten = true;
            } else {
                writingCode = true;
            }

            if (timeOfDay > 12 && !lunchEaten) {
                writingCode = false;
                lunchEaten = true;
            } else {
                writingCode = true;
            }

            if (timeOfDay > 16 && !dinnerEaten) {
                writingCode = false;
                dinnerEaten = true;
            } else {
                writingCode = true;
            }
        }
        timeOfDay = timeOfDay + .15;

        if (dinnerEaten && timeOfDay > 22.00) {
            awake = false;
        }
    }
}