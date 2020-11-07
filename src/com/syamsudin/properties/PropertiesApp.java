package com.syamsudin.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {


//        membaca properties
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/com/syamsudin/properties/application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException e) {
            System.out.println("tidak ditemukan lur");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //    menulis properrties

        Properties p = new Properties();
        p.put("name.first","fikri");
        p.put("name.last","syamsudin");
        try {
            p.store(new FileOutputStream("src/com/syamsudin/properties/name.properties"),"konfigurasi nama");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
