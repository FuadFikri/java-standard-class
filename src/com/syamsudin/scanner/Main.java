package com.syamsudin.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //System.in _> baca dari console

//        Scanner scanner = new Scanner(file.txt);

        System.out.print("nama : ");
        String name = scanner.nextLine();

        System.out.println("Hi "+ name.toUpperCase());
    }
}
