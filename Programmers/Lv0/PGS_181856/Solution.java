package Lv0.PGS_181856;

class Solution {
    public int solution(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }

        int sum1 = 0;
        int sum2 = 0;

        for (int t : arr1) sum1 += t;
        for (int t : arr2) sum2 += t;

        if (sum1 == sum2) return 0;
        return sum1 > sum2 ? 1 : -1;
    }
}
