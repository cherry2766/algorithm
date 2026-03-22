package Lv0.PGS_181900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            list.add(c);
        }

        System.out.println("list = " + list);

        Arrays.sort(indices);

        for (int i = indices.length - 1; i >= 0; i--) {
            list.remove(indices[i]);
        }

        System.out.println("list = " + list);

        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }
}
