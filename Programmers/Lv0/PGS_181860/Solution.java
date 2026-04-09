package Lv0.PGS_181860;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {

        ArrayList<Integer> X = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                int t = arr[i];
                for (int j = 0; j < t * 2; j++) {
                    X.add(t);
                }
            } else {
                int t = arr[i];
                for (int j = 0; j < t; j++) {
                    X.remove(X.size() - 1);
                }
            }
        }
        int[] result = new int[X.size()];
        int idx = 0;
        for (int i : X) {
            result[idx++] = i;
        }
        return result;
    }
}
