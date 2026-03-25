package Lv2.PGS_181188;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[][] targets = {
                {4,5},
                {4,8},
                {10,14},
                {11,13},
                {5,12},
                {3,7},
                {1,4}
        };
        // 각 구간의 끝 값 기준으로 오름차순 정렬
        // 끝 값 기준으로 정렬하면, 해당 구간의 끝 직전에 미사일을 쏘는 것이
        // 이후 구간들을 최대한 많이 커버할 수 있는 최적의 선택이 됨
        Arrays.sort(targets, (a,b) -> a[1] - b[1]);
        System.out.println(Arrays.deepToString(targets));
        // 미사일 발사 개수
        int cnt = 0;
        // 그 미사일이 커버할 수 있는 구간의 경계값
        // 이 값 이상부터는 기존 미사일로는 커버할 수 없음
        int last = -1;
        // 현재 구간의 시작이 last 이상이면,
        // 기존 미사일로는 커버 불가능 → 새로운 미사일 발사
        for(int i = 0; i < targets.length; i++) {
            // 현재 구간의 시작값
            int start = targets[i][0];
            // 현재 구간의 끝 값
            int end = targets[i][1];
            if(start >= last) {
                cnt++;
                // 새 미사일을 현재 구간의 끝 직전에 발사했다고 가정하고
                // 커버 범위의 경계값을 end로 갱신
                last = end;
            }
        }

        System.out.println("cnt = " + cnt);

    }
}
