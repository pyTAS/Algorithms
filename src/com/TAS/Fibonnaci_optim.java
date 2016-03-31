package com.TAS;

import java.util.Scanner;

/**
 * Created by andrei on 21.03.2016.
 */
public class Fibonnaci_optim {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        int n = scanner.nextInt();

        if (n<=0){
            System.out.println("Indicele citit este invalid");
        } else if (n == 1) {
            System.out.println("elementul n este: "  + 1);
        } else if (n == 2) {
            System.out.println("elementul n este: "  + 2);
        } else if (n > 2) {

            int anterior1 = 2;
            int anterior2 = 1;
            int curent = 0;

            for (int i = 2; i < n; i++) {
                curent = anterior1 + anterior2;
                anterior2 = anterior1;
                anterior1 = curent;
            }

            System.out.println("elementul n este: "  + curent);
        }


    }
}
