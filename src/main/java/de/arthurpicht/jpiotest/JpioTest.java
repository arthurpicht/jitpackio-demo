package de.arthurpicht.jpiotest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JpioTest {

    /**
     * requires JDK 11
     */
    public static void varLambda() {

        List<String> list = Arrays.asList("a", "b", "c");

        // keyword 'var' in lambda requires JDK 11
        String result = list.stream().map((var x) -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println();

    }

    public static void main(String[] args) {
        System.out.println("JPIO Test.");
    }
}
