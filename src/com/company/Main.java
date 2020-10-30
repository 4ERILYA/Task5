package com.company;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Height = ");
        int h = scan.nextInt();
        System.out.print("Weight = ");
        int w = scan.nextInt();

        drawPicture(h, w);

    }

    private static void drawPicture(int h, int w) {
        for (int i = 0; i < h; i++) {
            writeSpaces(i);
            writeSequenceDigits(w - i);
            System.out.println();
        }
    }

    private static void writeSpaces(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(' ');
        }
    }

    private static void writeSequenceDigits(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i % 10);
        }
    }
}