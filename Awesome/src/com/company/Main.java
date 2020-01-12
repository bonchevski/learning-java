package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
    // Will be using the java.io.BufferedReader; for console input lecture
    //import java.io.InputStreamReader; lets us read the input and the exception is for errors

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        System.out.println(name);



    }
}
