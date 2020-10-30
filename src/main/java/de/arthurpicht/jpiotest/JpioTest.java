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

    /**
     * requires JDK 14, preview in JDK 13
     */
    public static String switchYield(int number) {
        return switch (number) {
            case 1, 2:
                yield "one or two";
            case 3:
                yield "three";
            case 4, 5, 6:
                yield "four or five or six";
            default:
                yield "unknown";
        };

    }

    public static void main(String[] args) {
        System.out.println("JPIO Test.");
    }
}
