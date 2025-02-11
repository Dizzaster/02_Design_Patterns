package com.cc.java.singleton;

import com.cc.java.tools.Helper;

public class App {


    public static void main(String[] args) {
        
        Singleton obj = Singleton.getInstance();
        Helper.output(obj);

        Singleton obj2 = Singleton.getInstance();
        Helper.output(obj2);

        

    }


}
