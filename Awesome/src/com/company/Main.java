package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Print the line");

        /*
            byte data type
            * Whole number
            8 bits in size
            min -128
            max +127
         */
        byte varByte = 9;
        System.out.println(varByte);

        /*Short data type
         * 16 bit in size
         * Whole number
         * min value -32,768 (-2^15)
         * max value 32,767 (2^15 -1)
         *
         * */
        short varShort = 10;
        System.out.println(varByte);

        /*Long data type
            Whole number
         * 64 bit in size
         * min value -9,223,372,036,854,775,808 (-2^63)
         * max value 9,223,372,036,854,775,807 (-2^63 -1)
         *
         * */
        long varLong = 12;
        System.out.println(varByte);

        /*
         * 32 bits in size
         * Whole number
         * min value - 2,147,483,648 (-2 ^31)
         * max value 2,147,483,648 (2 ^31 -1*/
        int varInt = 9;
        System.out.println(varInt);

        /*
         * 32 bits in size
         * min value - 2,147,483,648 (-2 ^31)
         * max value 2,147,483,648 (2 ^31 -1*/
        float varfloat = 9.23f;
        System.out.println(varfloat);
        double varDec = 9.0d;
        System.out.println(varDec);
        /*
        * Bool Data
        * 1bit size
        * true or false*/
        boolean varBool = true;
        System.out.println(varBool);
        /*
         * char Data
         * 16bit size
         * */
        char varChar = 'A';
        System.out.println(varChar);
        /*
         * string Data
         * 16bit size
         * */
        String varString = "A string that is a string";
        System.out.println(varString);

    }
}
