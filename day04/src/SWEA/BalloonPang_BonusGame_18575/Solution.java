package SWEA.BalloonPang_BonusGame_18575;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int maxSum = Integer.MIN_VALUE;
            int minSum = Integer.MAX_VALUE;

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {

                    int sum = arr[r][c];

                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        while (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                            sum += arr[nr][nc];
                            nr += dr[d];
                            nc += dc[d];
                        }
                    }
                    maxSum = Math.max(maxSum, sum);
                    minSum = Math.min(minSum, sum);
                }
            }
            System.out.println("#" + tc + " " + (maxSum - minSum));
        }
    }
}
