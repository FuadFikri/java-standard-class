package com.syamsudin.arrays;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {


        int[] numbers = {
                1, 2, 34, 3, 123, 53, 73, 22, 31, 99, 323, 12, 34, 6, 53, 91
        };

//        MENGURUTKKAN ARRAY
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        PENCARIAN : BINARY SEARCH-> datanya harus urut dulu
        System.out.println(Arrays.binarySearch(numbers,99)); //return index si nomor 99
        System.out.println(Arrays.binarySearch(numbers,1000)); // jika data tdk ada akan return angka negatif

//        COPY
        int[] result = Arrays.copyOf(numbers, 5); //copy sebanyak 5 dari index awal
        System.out.println(Arrays.toString(result));

        int[] result2 = Arrays.copyOfRange(numbers, 5,9); //copy mulai dari index ke 5, sebanyak 4 angka
        System.out.println(Arrays.toString(result2));


    }
}
