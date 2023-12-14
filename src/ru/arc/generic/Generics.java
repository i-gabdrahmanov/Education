package ru.arc.generic;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<? super Number> list = new ArrayList<>();
        String a1 = "String";
        Integer a2 = 3;
        Double a3 = 2.4;
        list.add(a2);
        list.add(a3);
        List<String> strings = new ArrayList<>();
        strings.add(a1);
        strings.add("!");
        strings.add("Test");
        List<Integer> ints = List.of(5,2,75);
        test(strings);
        test(ints);
        List<? extends Number> varList = List.of(6,86.9);
        test(varList);


        //System.out.println(list);
    }

    private static void test(List<?> testList) {
        System.out.println(testList);
    }
}
