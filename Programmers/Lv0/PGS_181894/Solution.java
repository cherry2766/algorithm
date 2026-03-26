package Lv0.PGS_181894;

class Solution {
    public int[] solution(int[] arr) {
        int s = -1;
        int e = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                s = i;
                break;
            }
        }

        if (s == -1) {
            return new int[]{-1};
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                e = i;
                break;
            }
        }

        int[] result = new int[e - s + 1];
        int idx = 0;
        for (int i = s; i <= e; i++) {
            result[idx++] = arr[i];
        }

        return result;
    }
}
