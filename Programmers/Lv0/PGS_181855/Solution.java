package Lv0.PGS_181855;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (String s : strArr) {
            int len = s.length();

            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        int max = 0;
        for (int cnt : map.values()) {
            if (cnt > max) {
                max = cnt;
            }
        }
        return max;
    }
}