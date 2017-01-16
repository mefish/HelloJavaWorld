package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static boolean exit = false;

    public static void main(String[] args) {
        System.out.print("Hello!");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = "";
	while (!exit) {
	    try {
          command = reader.readLine();
        } catch (IOException e) {
          e.printStackTrace();
        }
        System.out.print(command);
        if (command.contains("exit")) {
	        exit = true;
        }
    }
    }
}
