package Lv0.PGS_181909;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i, my_string.length()));
        }

        String[] arr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        Arrays.sort(arr);

        return arr;
    }
}
