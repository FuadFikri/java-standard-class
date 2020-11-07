package com.syamsudin.objects;

import java.util.Objects;

public class ObjectsApp {
    public static void main(String[] args) {
        execute(new Product("sepeatu"));


        execute(null);
    }

    public static void execute(Product product){
        System.out.println(Objects.toString(product));
        System.out.println(Objects.hashCode(product));

//        bisa kena Null pointer
//        System.out.println(product.toString());
//        System.out.println(product.hashCode());
    }
}
