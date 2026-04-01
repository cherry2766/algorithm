package Lv0.PGS_181885;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for (boolean b : finished) {
            if (!b) size++;
        }

        String[] arr = new String[size];

        int idx = 0;
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                arr[idx++] = todo_list[i];
            }
        }
        return arr;
    }
}
