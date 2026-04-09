package Lv0.PGS_181861;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int t : arr) {
            for (int i = 0; i < t; i++) {
                list.add(t);
            }
        }

        int[] result = new int[list.size()];
        int idx = 0;
        for (int t : list) {
            result[idx++] = t;
        }

        return result;
    }
}
