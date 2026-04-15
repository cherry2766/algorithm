package Lv0.PGS_181854;

class Solution {
    public int[] solution(int[] arr, int n) {

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) arr[i] += n;
            }
            return arr;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 1) arr[i] += n;
            }
            return arr;
        }
    }
}