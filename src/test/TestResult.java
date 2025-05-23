package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String primes = Exercise.Calculate(50, 100);
        System.out.println("Prime numbers between 50 and 100: " + primes);
    }
}
