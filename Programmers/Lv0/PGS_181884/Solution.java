package Lv0.PGS_181884;

class Solution {
    public int solution(int[] numbers, int n) {

        int sum = 0;
        for (int i : numbers) {
            sum += i;
            if (n < sum) return sum;
        }
        return sum;
    }
}
