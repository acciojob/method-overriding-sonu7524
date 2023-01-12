package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());

    }
    public static class A {
        public static String meth() {
            String s = "Invoking method from class A";
            return s;
        }
    }
    public static class B extends A {
        public static String meth() {
            String s = "Method is overridden in Extendend class B";
            return s;
        }
    }
}


