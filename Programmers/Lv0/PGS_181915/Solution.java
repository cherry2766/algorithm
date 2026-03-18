package Lv0.PGS_181915;

class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < index_list.length; i++) {
            sb.append(my_string.charAt(index_list[i]));
        }

        return sb.toString();
    }
}
