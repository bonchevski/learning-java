package com.company;

public class Main {

    public static void main(String[] args)   {
        int num1 = 5;
        int num2 = 3;
    // Operators start

        // Arithmetic operators

        System.out.println(num1+num2);
        System.out.println(num1*num2);
        System.out.println(num1%num2);
//        num1++;
        System.out.println(num1+"Incremented");
//        num2--;
        System.out.println(num2+"Decremented");

    // Relational Operators

        System.out.println(num1 == num2); // will Print false now
        System.out.println(num1 != num2); // true
        System.out.println(num1 > num2); // true
        System.out.println(num1 >= num2); // false

        // Bitwise operators

        System.out.println(num1 & num2);


        // Logical operators

        boolean var1=true;
        boolean var2=false;

        System.out.println(var1&&var2);
        System.out.println(var2||var1);


        // Assignment operator
        int num3 = 4;
        num3+=8; // adds 8 the below adds it once again and should be 16 + 4 = 20 later changed to 12 again with subtraction
        System.out.println(num3+=8);
        System.out.println(num3-=8);

        // Conditional operator
        int num4 = 65;
        int num5 = 23;

        int result = (num4==num5)? 34:13;
        System.out.println(result);
    }
}
