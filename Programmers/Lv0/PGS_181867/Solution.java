package Lv0.PGS_181867;

class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x", -1);
        int[] arr = new int[strArr.length];
        int idx = 0;
        for (String s : strArr) {
            arr[idx++] = s.length();
        }
        return arr;
    }
}
