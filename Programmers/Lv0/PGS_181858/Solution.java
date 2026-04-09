package Lv0.PGS_181858;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : arr) {
            if (!list.contains(x)) {
                list.add(x);
            }
            if (list.size() == k) break;
        }
        if (list.size() < k) {
            int size = k - list.size();
            for (int i = 0; i < size; i++) {
                list.add(-1);
            }
        }
        int[] result = new int[k];
        int idx = 0;
        for (int t : list) {
            result[idx++] = t;
        }
        return result;
    }
}
