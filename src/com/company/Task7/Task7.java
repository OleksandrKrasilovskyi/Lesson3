package com.company.Task7;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {

        List<List<String>> lists = new ArrayList<>();
        lists.add(List.of("ab", "bc"));
        lists.add(List.of("cd", "de"));

        System.out.println(flatStreamToStream(lists));
    }

    public static List<String> flatStreamToStream(final List<List<String>> lists) {

        return lists.stream()
                .collect(ArrayList::new, List::addAll, List::addAll);
    }
}
