package Lv3.PGS_12927;

import java.util.PriorityQueue;

class Solution2 {
    public long solution(int n, int[] works) {
        long answer = 0;

        // 전체 작업량의 합이 n보다 작거나 같으면 모든 작업을 0으로 만들 수 있으므로 0 리턴
        int t = 0;
        for (int i : works)
            t += i;
        if (t < n)
            return 0;

        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int w : works)
            q.offer(w);

        for (int i = 0; i < n; i++) {
            int mw = q.poll();
            mw--;
            q.offer(mw);
        }
        while (!q.isEmpty()) {
            int w = q.poll();
            answer += (long) w * w;
        }
        return answer;
    }
}
