package Lv0.PGS_181938;

class Solution {
    public int solution(int a, int b) {
        int sum = Integer.parseInt(a + "" + b);
        int mul = 2 * a * b;

        return Math.max(sum, mul);
    }
}
