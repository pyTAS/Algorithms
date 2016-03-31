package com.TAS;

import java.util.Scanner;

/**
 * Created by andrei on 22.03.2016.
 */
public class PrimeNumber {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduceti numarul: ");
        int nr = scanner.nextInt();
        for (int i=2; i<=nr; i++){
            if (isPrime(i)){
                System.out.println(i + " is prime");
            }

        }

        /*
        int[] a = new int[nr];

        for (int i=0;i<nr; i++){
            a[i]=i+1;
            if (a[i]%(int)(a[i]/2)!=0){
                System.out.println(a[i] + "  este prim");
            }
        }*/

        /*for (int j=2; j<nr; j++){

            for (int i=2; i<nr; i++){
                if (nr%i==0){
                    System.out.println(nr + " nu este prim");
                } else {
                    System.out.println(nr + " este prim");
                }
            }

        }*/
        /*for (int i=2; i<nr; i++){
            if (nr%i==0){
                System.out.println(nr + " nu este prim");
            } else {
                System.out.println(nr + " este prim");
            }
        }
*/
        //(a[i]%2!=0)&&(a[i]%3!=0)&&(a[i]%5!=0)
        //(a[i]%2!=0)&&((a[i]%3!=0)||(a[i]%5!=0))

    }

    public static boolean isPrime(int n){

        for (int i=2; i<n/2; i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }



}
