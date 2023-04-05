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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMinNum(n, nums));
    }
}