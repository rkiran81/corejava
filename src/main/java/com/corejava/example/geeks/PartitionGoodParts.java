package com.corejava.example.geeks;

import java.util.*;

/*
 * We are given an array A of length N and an integer K. We want to partition A into good parts, 
 * where each part contains consecutive elements, and each element in A belongs to exactly one part. 
 * A part is good if the difference between the maximum and the minimum element in the part is at most K. 
 * We will use dynamic programming to solve this problem.
 */

public class PartitionGoodParts {
    static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(CountWays(N, K, A));
    }

    public static int CountWays(int N, int K, int[] A) {
        int[] dp = new int[N];
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            int min = A[i];
            int max = A[i];
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                min = Math.min(min, A[j]);
                max = Math.max(max, A[j]);
                if (max - min <= K) {
                    dp[i] = (dp[i] + dp[j]) % MOD;
                } else {
                    break;
                }
            }
        }
        return dp[N - 1];
    }
}