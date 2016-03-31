package com.TAS;

import java.util.Scanner;

/**
 * Created by andrei on 27.03.2016.
 */

//functioneaza pt nr Armstrong de trei cifre
public class ArmstrongNo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int n=scanner.nextInt();
        if (isArmstrong(n)){
            System.out.println("The number " + n + " is an Armstrong number");
        } else {
            System.out.println("The number " + n + " is not an Armstrong number");
        }

    }

    public static boolean isArmstrong(int n){
        int m=n;
        int[] a = new int[m];
        int sum=0;
        int count=0;

        while (m!=0){

            a[count]=m%10;
            m=m/10;
            count++;
        }
        for (int i=0; i<count; i++){
            sum = sum + a[i]*a[i]*a[i];
        }

        if (n==sum){
            return true;
        } else {
            return false;
        }

    }
}
