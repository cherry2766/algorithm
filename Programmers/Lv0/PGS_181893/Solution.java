package Lv0.PGS_181893;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] cur = arr;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                cur = Arrays.copyOfRange(cur, 0, query[i] + 1);
            } else {
                cur = Arrays.copyOfRange(cur, query[i], cur.length);
            }
        }

        return cur;
    }
}
