package Lv0.PGS_181922;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for (int j = s; j <= e; j++) {
                if ((k == 0 && j == 0) || (k != 0 && j % k == 0)) {
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}
