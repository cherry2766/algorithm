package Lv0.PGS_181913;

class Solution {
    public String solution(String my_string, int[][] queries) {

        char[] arr = new char[my_string.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = my_string.charAt(i);
        }
        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];

            while (idx1 < idx2) {
                char temp = arr[idx1];
                arr[idx1] = arr[idx2];
                arr[idx2] = temp;

                idx1++;
                idx2--;
            }
        }
        return new String(arr);
    }
}
