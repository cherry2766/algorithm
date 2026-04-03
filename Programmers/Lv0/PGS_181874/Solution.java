package Lv0.PGS_181874;

class Solution {
    public String solution(String myString) {

        StringBuilder sb = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'a') {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c) && c != 'A') {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
