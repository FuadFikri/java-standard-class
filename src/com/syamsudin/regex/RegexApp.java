package com.syamsudin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String s = "Fuad FIkri Syamsudin Programmer";
//
//        diawali huruf a-z atau A-Z
//     ditengah-tengah harus ada huruf a nya
//        diakhiri huruf a-z atau A-Z
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()){
            String result = matcher.group();
            System.out.println(result);
        }

    }
}
