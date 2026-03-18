package Lv0.PGS_181912;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i];

            int num = Integer.parseInt(str.substring(s, s + l));

            if (num > k) {
                list.add(num);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
