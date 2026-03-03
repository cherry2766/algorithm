package SWEA.FlySwatter3_12712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 상,하,좌,우
        int[] dr1 = {-1, 0, 1, 0};
        int[] dc1 = {0, 1, 0, -1};
        // 대각선
        int[] dr2 = {-1, 1, 1, -1};
        int[] dc2 = {1, 1, -1, -1};

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // N*N 배열
            int N = Integer.parseInt(st.nextToken());
            // 스프레이
            int M = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];
            for (int r = 0; r < N; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    arr[r][c] = Integer.parseInt(st.nextToken());
                }
            }
            // 최대값 갱신
            int maxVal = Integer.MIN_VALUE;
            // 좌표 하나씩 탐색
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {

                    // 기준점
                    int cr = r;
                    int cc = c;
                    int sum1 = arr[cr][cc];
                    // 방향 탐색 시작 (상하좌우)
                    for (int d = 0; d < 4; d++) {
                        for (int k = 1; k < M; k++) {
                            int nr = cr + dr1[d] * k;
                            int nc = cc + dc1[d] * k;
                            // 범위 체크
                            if (0 <= nr && nr < N && 0 <= nc && nc < N) {
                                sum1 += arr[nr][nc];
                            }
                        }
                    } // 델타 탐색(상하좌우) 끝
                    int sum2 = arr[cr][cc];
                    // 방향 탐색 시작 (대각선)
                    for (int d = 0; d < 4; d++) {
                        for (int k = 1; k < M; k++) {
                            int nr = cr + dr2[d] * k;
                            int nc = cc + dc2[d] * k;
                            // 범위 체크
                            if (0 <= nr && nr < N && 0 <= nc && nc < N) {
                                sum2 += arr[nr][nc];
                            }
                        }
                    }// 델타 탐색(대각선) 끝
                    maxVal = Math.max(Math.max(maxVal, sum1), sum2);
                }
            } // 좌표 탐색 끝
            System.out.println("#" + tc + " " + maxVal);
        }
    }
}
