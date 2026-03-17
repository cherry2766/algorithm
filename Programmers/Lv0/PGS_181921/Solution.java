package Lv0.PGS_181921;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        Queue<Long> queue = new ArrayDeque<>();

        queue.offer(5L);

        while (!queue.isEmpty()) {
            long cur = queue.poll();

            if (cur >= l && cur <= r) {
                list.add((int) cur);
            }

            long next1 = cur * 10;
            long next2 = cur * 10 + 5;

            if (next1 <= r) queue.offer(next1);
            if (next2 <= r) queue.offer(next2);
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        list.sort(null);

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
