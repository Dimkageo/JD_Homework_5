package org.example;

public class Fibonacci {
    public static int iterativeFibonacci(int n) {
//        Просторова складність: O(1)
//        Часова складність: O(n)
        if (n <= 1)
            return n;

        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    public static int recursiveFibonacci(int n) {
//        Просторова складність: O(n) (відповідає глибині рекурсії)
//        Часова складність: O(2^n) (експоненційна, через дублювання обчислень)
        if (n <= 1)
            return n;

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }


    public static int dynamicProgrammingFibonacci(int n) {
//        Просторова складність: O(n)
//        Часова складність: O(n)
        if (n <= 1)
            return n;

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
