package org.example;

/**
 *
 */
public class App {
    public static void main(String[] args) {
        int n = 6; // Заданий номер числа Фібоначчі

        int iterativeResult = Fibonacci.iterativeFibonacci(n);
        int recursiveResult = Fibonacci.recursiveFibonacci(n);
        int dynamicResult = Fibonacci.dynamicProgrammingFibonacci(n);

        PrintResult.printResult(iterativeResult, recursiveResult, dynamicResult);
    }

}
