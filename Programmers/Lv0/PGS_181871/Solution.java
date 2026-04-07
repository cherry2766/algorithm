package Lv0.PGS_181871;

class Solution {
    public int solution(String myString, String pat) {

        int cnt = 0;
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            boolean match = true;
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) cnt++;
        }
        return cnt;
    }
}
