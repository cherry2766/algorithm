package Lv0.PGS_181932;

class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else {
                if (mode == 0) {
                    if (i % 2 == 0) {
                        ret.append(code.charAt(i));
                    }
                } else {
                    if (i % 2 == 1) {
                        ret.append(code.charAt(i));
                    }
                }
            }
        }
        if (ret.length() != 0) {
            return ret.toString();
        } else {
            return "EMPTY";
        }
    }
}
