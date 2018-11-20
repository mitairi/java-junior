package com.acme.edu;

public class Logger {
    private static final String LINE_SEPARATOR = "\n";
    private static final String MEGGAGE_BEGINS = "str ";
    private static int TempSum = 0;


    public static void log(int message) {
        TempSum = TempSum + message;
        System.out.println("primitive: " + message );

    }

    public static void log(byte message) {
        System.out.println("primitive: " + message);
    }

    public static void log(char message) {
        System.out.println("char: " + message);
    }

    public static void log(String message) {
        if (message.contains("str "))  {
                System.out.println(message);
        } else
        System.out.println("string: " + message);
    }



    public static void main(String[] args) {

        System.out.println("char: a, b");
    }
}