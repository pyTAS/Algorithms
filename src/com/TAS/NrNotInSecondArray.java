package com.TAS;
import java.util.Arrays;

/**
 * Created by andrei on 24.03.2016.
 */
public class NrNotInSecondArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 1, 0, 5};
        int xor=0;

        for (int i=0; i<a.length;i++){
            xor ^= a[i];
        }

        for (int i=0; i<b.length; i++){
            xor^=b[i];
        }
        System.out.println("missing number: " + xor);

        /*for (int i=0; i<a.length; i++){
            for (int j=0; j<b.length; j++){
                *//*if (a[i]==b[j]&& i!=j){
                    return;
                } else {
                    System.out.println(a[i]);
                }*//*
                if (!a.equals(b[i])){
                    System.out.println(a[i]);

                }


            }
        }*/
    }
}
//&&(i!=j)