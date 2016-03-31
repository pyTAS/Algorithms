package com.TAS;
import java.util.Arrays;

/**
 * Created by andrei on 24.03.2016.
 */

// Number not present in second array

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

    }
}
//&&(i!=j)