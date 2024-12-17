package org.example;

public class JavaVariables {
    public static void main(String[] args) {
        byte b = 125;//-128 to 127
        short s1 = 19; // short range is -32,768 to 32,767
        int num = 918232;//-2^31 to 2^31 - 1
        long l = 9876l; //-2^63 to 2^63 - 1
        System.out.println(Math.pow(2,63));
        float f = 10.5f;// single prisicion
        double d = 22.0d;//double prisicion
        System.out.println(d);
        char c = 'S';// stores only one character value
        boolean boo = false ;// by default boolean value is false
        System.out.println(boo);

        /* adding multiple line comments */
        /*
         single line comments we use //
         all above mentioned as java variables
        */
        // in this I've to create more classes like this to perform this type of things
    }
}
