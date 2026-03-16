package Lv0.PGS_181927;

class Solution {
    public int[] solution(int[] num_list) {
        int[] result = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) {
            result[i] = num_list[i];
        }

        int lastIdx = num_list.length - 1;
        int prevIdx = num_list.length - 2;

        if (num_list[lastIdx] > num_list[prevIdx]) {
            result[num_list.length] = num_list[lastIdx] - num_list[prevIdx];
        } else {
            result[num_list.length] = num_list[lastIdx] * 2;
        }

        return result;
    }
}
