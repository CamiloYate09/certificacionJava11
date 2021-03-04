package com.interfaces;

public interface Red extends Back {
    default void getColor(){
        System.out.println("Red");
    }
}
