package Lv0.PGS_181863;

class Solution {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();

        for (char c : rny_string.toCharArray()) {
            if (c == 'm') {
                sb.append("rn");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
