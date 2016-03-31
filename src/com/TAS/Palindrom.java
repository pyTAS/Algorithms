package com.TAS;

import java.util.Scanner;

/**
 * Created by andrei on 22.03.2016.
 */
public class Palindrom {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduceti numarul: ");
        int n=scanner.nextInt();
        int cont=0;
        int[] m = new int[100];

        while(n>0){
            m[cont]= n%10;
            n=n/10;
            cont++;
        }

        boolean ePal=true;
        for (int i=0; i<cont/2; i++){
            if (m[i]!=m[cont-1-i]){
                ePal=false;
                break;
            }
        }

        if (ePal){
            System.out.println("Numarul este palindrom");
            int nr=0;
            for (int i=m.length-1; i>=0; i--){
                nr=nr*10+m[i];
            }
            System.out.println("Numarul reconstruit este: \n" + nr);
        } else {
            System.out.println("Numarul nu este palindrom");
        }





    }

}
