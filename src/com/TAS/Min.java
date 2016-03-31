package com.TAS;

/**
 * Created by andrei on 21.03.2016.
 */
public class Min {

    public static void main(String[] args) {
        int min;
        int max;
        int[]a = {100,21,5,97,20,6};
        min=a[0];
        max=a[0];
        for (int i=0; i<6;i++){
            if (min>a[i]){
                min=a[i];
            }
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println("min= " + min);
        System.out.println("max= " + max);
    }
}
