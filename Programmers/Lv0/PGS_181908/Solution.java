package Lv0.PGS_181908;

class Solution {
    public int solution(String my_string, String is_suffix) {

        boolean ans = false;
        for (int i = 0; i < my_string.length(); i++) {
            String str = my_string.substring(i, my_string.length());

            if (str.equals(is_suffix)) {
                ans = true;
                break;
            }
        }
        if (ans) {
            return 1;
        } else {
            return 0;
        }
    }
}
