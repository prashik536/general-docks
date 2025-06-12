package com.example;

public class Hello {
    public String greet() {
        return "Hello, Jenkins!";
    }

    public static void main(String[] args) {
        System.out.println(new Hello().greet());
    }
}
