package com.company.Creational;

public class singletone {
    public String value;
    private static singletone instance;

    private singletone(String value) {
        this.value = value;
    }
    public static singletone getInstance(String value){
        if (instance == null){
            instance = new singletone(value);

        }
        return instance;
    }


}
