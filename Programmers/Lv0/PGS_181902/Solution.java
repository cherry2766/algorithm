package Lv0.PGS_181902;

class Solution {
    public int[] solution(String my_string) {
        int[] result = new int[52];

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result[c - 'A']++;
            } else {
                result[c - 'a' + 26]++;
            }
        }

        return result;
    }
}
