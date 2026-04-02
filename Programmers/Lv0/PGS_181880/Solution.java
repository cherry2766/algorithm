package Lv0.PGS_181880;

class Solution {
    public int solution(int[] num_list) {

        int cnt = 0;
        for (int num : num_list) {
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                    cnt++;
                } else {
                    num = (num - 1) / 2;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
