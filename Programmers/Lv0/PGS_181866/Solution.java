package Lv0.PGS_181866;

import java.util.ArrayList;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();

        for (String s : arr) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        list.sort(null);
        return list.toArray(new String[0]);
    }
}
