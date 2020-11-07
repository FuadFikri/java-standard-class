package com.syamsudin.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name   = "Fuad Fikri Syamsudin";

        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()){
            String result = tokenizer.nextToken();
            System.out.println(result);
        }


        String [] names = name.split(" ");
        for (String s : names) {
            System.out.println(s);
        }


        /*
        * split dan StringTokenizer punya fungsi yang sama yaitu memotong string
        * kalau split langsung jadi array
        * kalau stringtokenizer lazy -> jadi lebih hemat memory
        * */
    }
}
