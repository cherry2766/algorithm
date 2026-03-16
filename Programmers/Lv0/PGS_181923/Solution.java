package Lv0.PGS_181923;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];
            int idx3 = queries[i][2];

            int ans = Integer.MAX_VALUE;
            boolean flag = false;

            for (int j = idx1; j <= idx2; j++) {

                if (arr[j] > idx3) {
                    flag = true;
                    ans = Math.min(ans, arr[j]);
                }
            }
            if (flag) {
                result[i] = ans;
            } else {
                result[i] = -1;
            }

        }
        return result;
    }
}
