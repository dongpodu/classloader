package me.will.classloader;

public class Main {
    /**
     * -XX:+TraceClassLoading
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
