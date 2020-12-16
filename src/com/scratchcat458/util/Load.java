package com.scratchcat458.util;

import com.google.gson.Gson;
import com.scratchcat458.speelin.list.WordList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Load {
    public static final String dir = "src\\_lists\\";
    public static final String path = "src\\_settings\\default.json";
    public static WordList loadListFile() throws FileNotFoundException {
        Gson g = new Gson();
        String fileName;
        Scanner i = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter the file name of the list to be imported:");
        fileName = i.next();
        return g.fromJson(new FileReader(dir + fileName + ".json"), WordList.class);
    }
    public static Settings loadSettingFile() throws FileNotFoundException {
        Gson g = new Gson();
        String fileName;
        Scanner i = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter the file name of the list to be imported:");
        fileName = i.next();
        return g.fromJson(new FileReader(dir + fileName + ".json"), Settings.class);
    }
    public static Settings loadDefaultSettingFile() throws FileNotFoundException {
        Gson g = new Gson();
        return g.fromJson(new FileReader(path), Settings.class);
    }
}
