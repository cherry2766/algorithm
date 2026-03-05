package SWEA.zero_8931;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int K = Integer.parseInt(br.readLine());

            Deque<Integer> stack = new ArrayDeque<>();

            int sum = 0;

            for (int i = 0; i < K; i++) {
                int amount = Integer.parseInt(br.readLine());

                if (amount != 0) {
                    stack.push(amount);
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
            System.out.println("#" + tc + " " + sum);
        }
    }
}
