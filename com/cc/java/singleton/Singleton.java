package com.cc.java.singleton;

public class Singleton {

    // Objektbildung in der Klasse --> static
    private static Singleton instance;

    private Singleton(){

    }  

    // ... in der Klasse

    public static Singleton getInstance() {
        
        if (instance == null) {
            return instance = new Singleton();
        }
        return instance;   
        
        // return instance == null ? instance = new Singleton() : instance;

    }






}
