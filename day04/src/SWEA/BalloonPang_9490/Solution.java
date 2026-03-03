package SWEA.BalloonPang_9490;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        //4방향 델타 배열
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][M];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            // 꽃가루의 합 중 최대값
            int maxSum = Integer.MIN_VALUE;
            // 현재 기준점 좌표 구하기
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    int cr = r;
                    int cc = c;
                    // 탐색 범위 설정, 현재 좌표의 값만큼만 이동
                    int range = arr[r][c];
                    // 꽃가루의 합
                    int sum = arr[r][c];

                    for (int d = 0; d < 4; d++) {
                        // K칸 이동
                        for (int k = 1; k <= range; k++) {
                            int nr = cr + dr[d] * k;
                            int nc = cc + dc[d] * k;
                            // 범위 벗어나면 그만, 방향 바꾸기
                            if (nr < 0 || nr >= N || nc < 0 || nc >= M) {
                                break;
                            }
                            // 값 더하기
                            sum += arr[nr][nc];
                        }
                    }
                    // 해당 칸에서 4방향 다 더한 최대값 갱신
                    maxSum = Math.max(maxSum, sum);
                }
            }
            System.out.println("#" + tc + " " + maxSum);
        }
    }
}
