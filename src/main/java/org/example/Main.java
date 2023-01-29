package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.class.path"));

        List brothers = new ArrayList<String>();
        brothers.add("cedric");
        brothers.add("caroline");
        brothers.add("christophe");
        System.out.println(brothers.indexOf("cedric"));
    }
}