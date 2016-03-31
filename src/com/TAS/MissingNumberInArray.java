package com.TAS;

import java.util.Scanner;

/**
 * Created by andrei on 23.03.2016.
 */
public class MissingNumberInArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("introduceti lungimea sirului:");
        //int n = scanner.nextInt();
        int n =8;
        int[] a = {1,2,3,4,5,7,8};
        int sumCalc=(n*(n+1))/2;
        int sumExpected=0;

        for (int i: a){
            sumExpected = sumExpected + i;
        }

        int dif = sumCalc-sumExpected;
        if (dif==0){
            System.out.println("Nu este numar lipsa");
        } else {
            System.out.println("Numarul lipsa este: " + dif);
        }

    }
}
