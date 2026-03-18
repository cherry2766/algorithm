package Lv0.PGS_181911;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            int idx1 = parts[i][0];
            int idx2 = parts[i][1];

            String str = my_strings[i];

            sb.append(str.substring(idx1, idx2 + 1));
        }
        return sb.toString();
    }
}
