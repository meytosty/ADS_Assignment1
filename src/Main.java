import java.util.Scanner;

public class Main {
    static int findMinNum(int n, int[] numbers) {
        int minNum =numbers[0];
        for (int i = 1; i < n; i++) {
            if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
        }
        return minNum;
    }
    static double findAverage(int n, int[] numbers) {
        double total = numbers[0];
        for (int i = 1; i < n; i++) {
            total += numbers[i];
        }
        return total / n;
    }
    static boolean isNumberPrime(int n) {
        int d = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                d++;
            }
        }
        return d == 1;
    }
    static int findFact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * findFact(n-1);
        }
    }
    static int findFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2);
        }
    }
    static int findPow(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * findPow(a, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(findPow(a, n));
    }
}