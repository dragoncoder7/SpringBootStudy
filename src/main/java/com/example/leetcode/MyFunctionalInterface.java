package com.example.leetcode;

@FunctionalInterface
interface MyFunctionalInterface {

    boolean test(String value);
    // 默认方法
    default void printDescription() {
        System.out.println("Default method implementation");
    }
}