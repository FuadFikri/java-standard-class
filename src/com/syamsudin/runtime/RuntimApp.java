package com.syamsudin.runtime;

public class RuntimApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        runtime.freeMemory();
        runtime.totalMemory();
    }

}
