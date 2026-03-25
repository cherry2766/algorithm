package Lv3.PGS_12927;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int n = 3;
        int[] works = {1, 1};

        // 큰 값이 먼저 나오게 내림차순 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // 작업량 초기화
        for (int work : works) {
            pq.add(work);
        }

        while (n > 0) {
            // 가장 큰 작업량을 1 줄이고 다시 넣기
            int work = pq.poll();
            // 모두 0이면 종료
            if (work == 0) {
                pq.add(work);
                break;
            }
            work--;
            n--;
            pq.add(work);
        }

        System.out.println("pq = " + pq);

        long result = 0;
        // 큐가 비어있지 않을 동안 하나씩 꺼내서 제곱하고 더하기
        while (!pq.isEmpty()) {
            int work = pq.poll();
            result += work * work;
        }

        System.out.println("result = " + result);
    }
}
