package com.vit.demo;

public class AntTestRunner {

    public static void main(String[] args) {
        int result = App.add(2, 3);
        int expected = 5;

        if (result != expected) {
            System.out.println("TEST FAILED: expected " + expected + " but received " + result);
            System.exit(1);
        }

        System.out.println("TEST PASSED: App.add(2, 3) returned " + result + ".");
    }
}
