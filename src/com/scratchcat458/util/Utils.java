package com.scratchcat458.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utils {
    public static String[] removeFromString(String[] arr, String r) {
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        list.remove(r);
        arr = list.toArray(new String[0]);
        return arr;
    }
// --Commented out by Inspection START (3/12/2020 1:14 pm):
//    public static int[] randomiseInt(int[] a, int n) {
//        Random r = new Random();
//        for (int i = n-1; i > 0; i--) {
//            int j = r.nextInt(i);
//
//            int temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//        }
//        return a;
//    }
// --Commented out by Inspection STOP (3/12/2020 1:14 pm)

    public static String[] randomiseString(String[] a, int n) {
        Random r = new Random();
        for (int i = n-1; i > 0; i--) {
            int j = r.nextInt(i);

            String temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }
}
