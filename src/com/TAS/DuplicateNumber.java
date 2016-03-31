package com.TAS;

/**
 * Created by andrei on 23.03.2016.
 */
public class DuplicateNumber {
    public static void main(String[] args) {
        int n=6;
        int[] a={1,2,3,4,3,6};

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if ((a[i]==a[j])&&(i!=j)){
                    System.out.println(a[i]);

                }


            }
        }
    }
}
