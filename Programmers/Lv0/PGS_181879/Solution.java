package Lv0.PGS_181879;

class Solution {
    public int solution(int[] num_list) {

        if (num_list.length >= 11) {
            int sum = 0;
            for (int n : num_list) sum += n;
            return sum;
        } else {
            int mul = 1;
            for (int n : num_list) mul *= n;
            return mul;
        }
    }
}
