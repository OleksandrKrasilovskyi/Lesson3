package com.company.Task8;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {

        final var list = List.of("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow");

        System.out.println(convertListToLinkedHashMap(list));
    }

    public static Map<String, Integer> convertListToLinkedHashMap(final List<String> strings) {

        return strings.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
    }
}
