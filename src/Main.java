import java.util.Scanner;

public class Main {
    /**
     * findMinNum - function assist you find a minimum number from given array
     * @param n - length of given array
     * @param numbers - given array
     * @return - function returns one integer - minimum from array
     */
    static int findMinNum(int n, int[] numbers) {
        int minNum =numbers[0];
        for (int i = 1; i < n; i++) {
            if (minNum > numbers[i]) {
                minNum = numbers[i];
            }
        }
        return minNum;
    }
    /**
     * findAverage - function find out average of array
     * @param n - length of given array
     * @param numbers - given array
     * @return - returns one double - average of array
     */
    static double findAverage(int n, int[] numbers) {
        double total = numbers[0];
        for (int i = 1; i < n; i++) {
            total += numbers[i];
        }
        return total / n;
    }
    /**
     * isNumberPrime - function checks is given number prime or not
     * @param n - given number
     * @return returns one statement - true if given number is prime, false otherwise
     */
    static boolean isNumberPrime(int n) {
        int d = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                d++;
            }
        }
        return d == 1;
    }
    /**
     * findFact - function find out factorial of given number
     * @param n - given number
     * @return - returns one integer - factorial number
     */
    static int findFact(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * findFact(n-1);
        }
    }
    /**
     * findFib - function find out number of Fibonacci sequence
     * @param n - given number
     * @return - return one integer - number of Fibonacci sequence
     */
    static int findFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2);
        }
    }
    /**
     * findPow - function helps to find "a" power of "n"
     * @param a - given number
     * @param n - power of number
     * @return - returns one integer - "a" power of "n"
     */
    static int findPow(int a, int n) {
        if (n == 1) {
            return a;
        }
        else {
            return a * findPow(a, n-1);
        }
    }
    /**
     * findReverse - function gives array in reverse order by string
     * @param n - length of given array
     * @param numbers - given array to reverse
     * @return - returns one string - array in reverse order
     */
    static String findReverse(int n, int[] numbers) {
        if (n == 1) {
            return Integer.toString(numbers[0]);
        }
        else {
            return Integer.toString(numbers[n-1]) + " " + findReverse(n-1, numbers);
        }
    }
    /**
     * isAllNumbers - function checks is string contains all numbers
     * @param text - given string
     * @return - return one statement - true if string contains all numbers, false otherwise
     */
    static boolean isAllNumbers(String text) {
        if (text.length() == 1) {
            return Character.isDigit(text.charAt(0));
        }
        else {
            return Character.isDigit(text.charAt(0)) && isAllNumbers(text.substring(1));
        }
    }
    /**
     * findBin - function that find a binomial coefficient by two numbers
     * @param n - first number
     * @param k - second number
     * @return - returns one integer - binomial coefficient by two numbers
     */
    static int findBin(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return findBin(n-1, k-1) + findBin(n-1, k);
        }
    }
    /**
     * findGCD - function helps to find out the greatest common divisor of two numbers
     * @param a - first number, must be greater than second
     * @param b - second number
     * @return - returns one integer - the greatest common divisor of two numbers
     */
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return findGCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));
    }
}