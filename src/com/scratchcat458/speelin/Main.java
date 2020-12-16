package com.scratchcat458.speelin;


import com.scratchcat458.speelin.game.WordGuess;
import com.scratchcat458.speelin.game.WordShuffle;
import com.scratchcat458.speelin.list.WordList;
import com.scratchcat458.util.Download;
import com.scratchcat458.util.Load;
import com.scratchcat458.util.Settings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean loop = true;
        WordList list = null;
        Settings s = new Settings();

        while(loop){
            Scanner i = new Scanner(System.in);

            System.out.println("1 Start");
            System.out.println("2 Download List");
            System.out.println("3 Load List");
            System.out.println("4 Settings");
            System.out.println("5 Exit");
            int n = i.nextInt();

            if(n == 1) {
                if(s.isLoadOnStart()){
                    list = Load.loadListFile();
                }
                System.out.println("1 Word Shuffle");
                System.out.println("2 Word Guess");

                int n4 = i.nextInt();
                if(n4 == 1) {
                    WordShuffle ws = new WordShuffle(list);
                    ws.startList();
                }
                else if(n4 == 2) {
                    WordGuess wg = new WordGuess(list);
                    wg.startList();
                }
                if(s.isAutoEnd()){
                    System.exit(1);
                }
            }
            else if(n == 2){
                Download.downloadListFile();
                loop = false;
            }
            else if(n == 3){
                list = Load.loadListFile();
                System.out.println(list.getName());
            }
            else if(n == 4){
                s = Load.loadDefaultSettingFile();
                boolean loop3 = true;
                while(loop3) {
                    System.out.println("1 Display Current");
                    System.out.println("2 Import Settings File");
                    System.out.println("3 Change Current");
                    System.out.println("4 Return to Default");
                    System.out.println("5 Exit");
                    int n2 = i.nextInt();
                    if (n2 == 1) {
                        System.out.println("Auto Continue: " + s.isAutoCont());
                        System.out.println("Auto End: " + s.isAutoEnd());
                        System.out.println("Load List during Start: " + s.isLoadOnStart());
                    } else if (n2 == 2) {
                        s = Load.loadSettingFile();
                        loop = false;
                    } else if (n2 == 3) {
                        boolean loop2 = true;
                        while (loop2) {
                            System.out.println("1 Auto Continue: " + s.isAutoCont());
                            System.out.println("2 Auto End: " + s.isAutoEnd());
                            System.out.println("3 Load List during Start: " + s.isLoadOnStart());
                            System.out.println("4 Exit");
                            int n3 = i.nextInt();

                            if (n3 == 1) {
                                s.setAutoCont(!s.isAutoCont());
                            } else if (n3 == 2) {
                                s.setAutoEnd(!s.isAutoEnd());
                            } else if (n3 == 3) {
                                s.setLoadOnStart(!s.isLoadOnStart());
                            } else {
                                loop2 = false;
                            }
                        }

                    } else if (n2 == 4) {
                        s = Load.loadDefaultSettingFile();
                    } else if (n2 == 5) {
                        loop3 = false;
                    }
                }
            }
            else if(n == 5) {
                System.out.println("Exiting Application");
                loop = false;
            }
        }
    }
}
