package Lv0.PGS_181857;

class Solution {
    public int[] solution(int[] arr) {

        int size = 1;

        while (size < arr.length) {
            size *= 2;
        }

        int[] result = new int[size];
        int idx = 0;
        for (int t : arr) {
            result[idx++] = t;
        }
        return result;
    }
}
