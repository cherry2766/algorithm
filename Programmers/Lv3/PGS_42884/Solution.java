package Lv3.PGS_42884;

import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;

        Arrays.sort(routes, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int end = -30001;

        for (int[] r : routes) {
            int s = r[0];
            int e = r[1];
            if (end < s) {
                answer++;
                end = e;
            }
        }

        return answer;
    }
}
