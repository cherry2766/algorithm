package Lv0.PGS_181929;

class Solution {
    public int solution(int[] num_list) {

        long mul = 1;
        long sum = 0;

        for (int num : num_list) {
            mul *= num;
            sum += num;
        }

        if (mul < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }
}
