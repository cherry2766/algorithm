package SWEA.cardgame_7102;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 합(i + j)이 나온 횟수를 저장할 카운팅 배열
            // 합의 최대값은 N + M 이므로 배열 크기는 N + M + 1
            int maxSum = N + M;
            int[] count = new int[maxSum + 1];

            // 두 카드의 합 등장 횟수 카운팅
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    count[i + j]++;
                }
            }

            // 가장 많이 나온 합의 등장 횟수 찾기
            int maxCount = 0;
            for (int sum = 2; sum < maxSum + 1; sum++) {
                if (maxCount < count[sum]) {
                    maxCount = count[sum];
                }
            }

            // 가장 많이 나온 합들을 오름차순으로 출력
            System.out.print("#" + tc + " ");
            for (int sum = 2; sum < N + M + 1; sum++) {
                if (count[sum] == maxCount) {
                    System.out.print(sum + " ");
                }
            }
            System.out.println();
        }
    }
}
