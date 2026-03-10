package SWEA_1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        // 1~ 10
        // 1 2 - 4 5 - 7 8 - 10 11 12 - ...

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        // 문자열 이어붙이기~~~~~~~~~~~
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int num = i;
            int cnt = 0;
            while (num != 0) {
                int n = num % 10;

                if (n == 3 || n == 6 || n == 9) {
                    cnt++;
                }
                num /= 10;
            }
            if (cnt == 1) {
                sb.append("-");
            } else if (cnt == 2) {
                sb.append("--");
            } else if (cnt == 3) {
                sb.append("---");
            } else {
                sb.append(i);
            }

            if (i < N) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
