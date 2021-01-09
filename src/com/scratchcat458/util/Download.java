package com.scratchcat458.util;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import static com.scratchcat458.util.Utils.space;

public class Download {
    public static void downloadListFile() throws Exception {
        String url;
        String fileName;
        Scanner i = new Scanner(System.in);

        System.out.println("");
        System.out.println("Enter the URL of the hosted list:");
        url = i.next();
        System.out.println("Enter the file name for the list to be saved as:");
        fileName = i.next();

        download(url, fileName);
    }
    public static void download(String url, String name) throws Exception {
        try (InputStream in = URI.create(url).toURL().openStream()) {
            Files.copy(in, Paths.get("src\\_lists\\" + name + ".json"));
            System.out.println("List from " + url + " imported successfully as " + name + ".json");
            space(4);
        }
    }
}
