package com.TAS;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// Fibonacci ver.1

        int n = scanner.nextInt();
        int lungime;
        if (n<2){
            lungime=2;
        } else {
            lungime=n;
        }

        int[] a = new int[lungime];
        a[0]=1;
        a[1]=2;

        for (int i=2; i<lungime; i++){
            a[i]=a[i-1]+a[i-2];
        }

        if (n<=0){
            System.out.println("Indicele citit este invalid");
        } else {
            System.out.println("elementul n este: "  + a[n-1]);
        }


    }
}
