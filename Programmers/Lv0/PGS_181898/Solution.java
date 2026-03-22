package Lv0.PGS_181898;

class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = 0; i < arr.length; i++) {
            if (idx <= i && arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
