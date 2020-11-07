package com.syamsudin.base64;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String s = "Hellow WOrld !";

        String encoded = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String result = new String(bytes);

        System.out.println(result);
    }
}
