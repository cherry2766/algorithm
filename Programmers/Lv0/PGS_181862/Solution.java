package Lv0.PGS_181862;

import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.trim().split("a|b|c");

        ArrayList<String> list = new ArrayList<>();

        for (String s : arr) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        if (list.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return list.toArray(new String[0]);
        }
    }
}
