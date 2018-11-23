package com.acme.edu;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

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

    public static void log(int [] intArray){
        System.out.println(("primitives array: "+Arrays.toString(intArray)).replace('[','{').replace(']','}'));
    }

    public static void log(int [][] matrix){
        System.out.println("primitives matrix: {");
        //System.out.println(("primitives array: "+Arrays.toString()).replace('[','{').replace(']','}'));
        for ( int [] elem: matrix){
            System.out.println(Arrays.toString(elem).replace('[','{').replace(']','}'));
            
        }
        System.out.println("}");
    }

    public static void main(String[] args) {

        System.out.println("char: a, b");
    }
}