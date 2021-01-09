package com.scratchcat458.util;

import org.jetbrains.annotations.NotNull;

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

    public static void space(int n) {
        for(int i = n; i > 0; i--) {
            System.out.println(" ");
        }
    }
}
