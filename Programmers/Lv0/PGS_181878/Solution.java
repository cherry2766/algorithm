package Lv0.PGS_181878;

class Solution {
    public int solution(String myString, String pat) {

        if (myString.length() < pat.length()) {
            return 0;
        }
        int s = pat.length();
        for (int i = 0; i <= myString.length() - s; i++) {
            String str = myString.substring(i, s + i);
            if (str.equalsIgnoreCase(pat)) {
                return 1;
            }
        }
        return 0;
    }
}
