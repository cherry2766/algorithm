package Lv0.PGS_181916;

import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        Arrays.sort(arr);

        int score = 0;

        if (arr[0] == arr[3]) {
            score = 1111 * arr[0];
        } else if (arr[0] == arr[2] || arr[1] == arr[3]) {
            if (arr[0] == arr[2]) {
                int p = arr[0];
                int q = arr[3];
                score = (10 * p + q) * (10 * p + q);
            } else {
                int p = arr[1];
                int q = arr[0];
                score = (10 * p + q) * (10 * p + q);
            }
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            int p = arr[0];
            int q = arr[2];
            int k = Math.abs(p - q);
            score = (p + q) * k;
        } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[3]) {
            if (arr[0] == arr[1]) {
                int q = arr[2];
                int r = arr[3];
                score = q * r;
            } else if (arr[1] == arr[2]) {
                int q = arr[0];
                int r = arr[3];
                score = q * r;
            } else {
                int q = arr[0];
                int r = arr[1];
                score = q * r;
            }
        } else {
            int min = Integer.MAX_VALUE;
            min = Math.min(min, a);
            min = Math.min(min, b);
            min = Math.min(min, c);
            min = Math.min(min, d);
            score = min;
        }

        return score;
    }
}
