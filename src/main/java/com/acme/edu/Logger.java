package com.acme.edu;

public class Logger {

    private static final String PRIMITIVE_PREFIX = "primitive: ";
    private static final String CHAR_PREFIX = "char: ";
    private static final String REFERENCE_PREFIX = "reference: ";
    private static long TempSum = 0;
    private static int TempSumByte = 0;
    private static int SubsequentCounter = 0;
    private static String TempString = "";
    private static boolean IsChangedInt = false;
    private static boolean IsChangedByte = false;
    private static boolean IsChangedString = false;


    public static void log(byte message) {
        flushString();
        if (TempSumByte + message > Byte.MAX_VALUE) {
            //print(String.valueOf(TempSumByte));
            print((byte) TempSumByte);
            TempSumByte = Byte.MAX_VALUE;
        } else TempSumByte += message;
        IsChangedByte = true;
        //print(PRIMITIVE_PREFIX + message);
    }

    public static void log(int message) {
        flushString();
        if (TempSum + message > Integer.MAX_VALUE) {
            print(String.valueOf(TempSum));
            TempSum = Integer.MAX_VALUE;
        } else TempSum += message;
        IsChangedInt = true;
        //String decoratedMessage = PRIMITIVE_PREFIX + message;
        //print(decoratedMessage);
    }

    public static void log(char message) {
        String decoratedMessage = CHAR_PREFIX + message;
        print(decoratedMessage);
    }

    public static void log(String message) {
        flush();
        if (TempString.equals(message)) {
            SubsequentCounter += 1;
        } else {
            IsChangedString = true;
            flushString();
            TempString = message;
            SubsequentCounter = 1;
        }
        IsChangedString = true;

        /*if (message.contains("str ")) {
            System.out.println(message);
        } else
            System.out.println("string: " + message);
        TempSum = 0;
        TempSumByte = 0;*/

    }

    public static void log(boolean message) {
        String decoratedMessage = PRIMITIVE_PREFIX + message;
        print(decoratedMessage);
    }

    public static void log(Object message) {

        String decoratedMessage = REFERENCE_PREFIX + message;
        print(decoratedMessage);
    }

    public static void flush() {
        if (IsChangedInt) {
            System.out.println(TempSum);
            TempSum = 0;
            IsChangedInt = false;
        }
        if (IsChangedByte) {
            System.out.println(TempSumByte);
            TempSumByte = 0;
            IsChangedByte = false;
        }

    }

    public static void flushString() {
        if (IsChangedString) {
            if (SubsequentCounter  == 1) print(TempString);
            else {
                if (SubsequentCounter > 1) System.out.println(TempString + " (x" + SubsequentCounter + ")");
            }
            //System.out.println(TempString);
            IsChangedString = false;
            SubsequentCounter = 0;
        }
    }

    private static void print(String decoratedMessage) {
        System.out.println(decoratedMessage);
    }

    private static void print(byte decoratedMessage) {
        System.out.println(decoratedMessage);
    }

}