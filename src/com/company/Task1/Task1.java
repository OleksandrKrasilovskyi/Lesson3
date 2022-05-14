package com.company.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num
                + " is " + Test.factorialCounter(num));
    }

}

class Test {
    static int factorialCounter(int n) {
        if (n == 0)
            return 1;

        return n * factorialCounter(n - 1);

        //Using Stream API
//        return Math.toIntExact(rangeClosed(1, n)
//                .reduce(1, (int a, int b) -> a * b));
    }
}
