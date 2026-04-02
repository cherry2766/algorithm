package Lv0.PGS_181881;

import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {

        int cnt = 0;

        while (true) {
            int[] prev = arr.clone();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(prev, arr)) {
                break;
            }
            cnt++;
        }
        return cnt;
    }
}

