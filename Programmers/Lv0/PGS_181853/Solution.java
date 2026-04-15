package Lv0.PGS_181853;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = num_list[i];
        }

        return arr;
    }
}
