package Lv0.PGS_181895;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int[] t : intervals) {
            int s = t[0];
            int e = t[1];

            for (int i = s; i <= e; i++) {
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];
        int idx = 0;
        for (int i : list) {
            result[idx++] = i;
        }

        return result;
    }
}