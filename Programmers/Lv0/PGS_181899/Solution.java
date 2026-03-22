package Lv0.PGS_181899;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = start_num - end_num + 1;
        int[] arr = new int[len];
        int idx = 0;
        for (int i = start_num; i >= end_num; i--) {
            arr[idx] = i;
            idx++;
        }

        return arr;
    }
}
