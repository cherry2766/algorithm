package SWEA.SnailNumbers_1954;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            int r = 0;
            int c = 0;
            int d = 0;
            int num = 1;

            while (num <= N * N) {
                arr[r][c] = num++;

                int nr = r + dr[d];
                int nc = c + dc[d];

                // 범위를 벗어나거나 현재 위치의 값이 0이 아니면 방향 바꾸기
                if (nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] != 0) {
                    d = (d + 1) % 4; // 0 1 2 3
                    nr = r + dr[d];
                    nc = c + dc[d];
                }

                r = nr;
                c = nc;
            }
            System.out.println("#" + tc);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

