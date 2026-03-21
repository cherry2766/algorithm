package Lv0.PGS_181905;

class Solution2 {
    public String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();

        while (s < e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
        return new String(arr);
    }
}
