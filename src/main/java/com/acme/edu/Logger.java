package com.acme.edu;

public class Logger {

    private static final String PRIMITIVE_PREFIX = "primitive: ";
    private static final String CHAR_PREFIX = "char: ";
    private static final String REFERENCE_PREFIX = "reference: ";

    public static void log(int message) {
        String decoratedMessage = PRIMITIVE_PREFIX + message;
        print(decoratedMessage);
    }

    public static void log(char message) {
        String decoratedMessage = CHAR_PREFIX + message;
        print(decoratedMessage);
    }

    public static void log(String message) {

        System.out.println("string: " + message);
    }

    public static void log(boolean message) {

        String decoratedMessage = PRIMITIVE_PREFIX + message;
        print(decoratedMessage);
    }

    public static void log(Object message) {

        String decoratedMessage = REFERENCE_PREFIX + message;
        print(decoratedMessage);
    }

    private static void print(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }


}