package com.company;


public class Class {
    public Class(String name) {
        System.out.println("Country: " + name);
    }

    public Class(int jashy) {
        System.out.println("Jashy: " + jashy);
    }

    public Class(int[] revo) {
        for (int i : revo) {
            System.out.println("Revolucia bolgon jyldar: " + i+".");
        }
    }
}