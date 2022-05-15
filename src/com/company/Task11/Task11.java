package com.company.Task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String line = buff.readLine();

        stringChallenge(line);
    }

    public static void stringChallenge(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append((char) (str.charAt(i) + 1));
        }
        System.out.println(result);
    }
}
