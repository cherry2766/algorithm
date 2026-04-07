package Lv0.PGS_181872;

class Solution {
    public String solution(String myString, String pat) {

        for (int i = myString.length() - pat.length(); i >= 0; i--) {
            boolean match = true;
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return myString.substring(0, i + pat.length());
            }
        }
        return "";
    }
}
