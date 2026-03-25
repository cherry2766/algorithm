package Lv2.PGS_42626;

import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int s : scoville)
            q.offer(s);

        while (q.peek() < K) {
            int f = q.poll();
            int s = q.poll();
            int t = f + s * 2;
            q.offer(t);
            answer++;
            if (q.size() == 1 && q.peek() < K)
                return -1;
        }
        return answer;
    }
}
