package com.syamsudin.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        String[] names = {"Rio","ferdinand", "lionel","rooney"};
        StringJoiner joiner = new StringJoiner("* ","<",">");

        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner.toString()); //        <Rio* ferdinand* lionel* rooney>

    }
}
