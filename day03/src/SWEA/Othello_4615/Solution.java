package SWEA.Othello_4615;

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
            // 한 변의 길이
            int N = Integer.parseInt(st.nextToken());
            // 돌을 놓는 횟수
            int M = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            // 정가운데 4칸은 배치하고 시작
            int mid = N / 2;
            arr[mid][mid - 1] = 1;
            arr[mid - 1][mid] = 1;
            arr[mid - 1][mid - 1] = 2;
            arr[mid][mid] = 2;

            // 8방향 탐색 배열
            int[] dr8 = {0, 1, 0, -1, -1, 1, 1, -1};
            int[] dc8 = {1, 0, -1, 0, 1, 1, -1, -1};

            // 돌 놓는 횟수 만큼 반복
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                // (x:열,y:행), 돌 색 입력받기
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int color = Integer.parseInt(st.nextToken());
                // 인덱스는 0부터 시작하니까 -1
                int r = y - 1;
                int c = x - 1;
                // 이 위치에 돌을 둠
                arr[r][c] = color;
                // 상대 돌
                int opp = (color == 1) ? 2 : 1;
                // 8방향 탐색 시작
                for (int d = 0; d < 8; d++) {
                    // 한 칸 이동
                    int nr = r + dr8[d];
                    int nc = c + dc8[d];
                    // 첫 칸이 범위 벗어나면 방향 바꿔야 함
                    if (nr < 0 || nr >= N || nc < 0 || nc >= N) {
                        continue;
                    }
                    // 첫 칸이 상대 돌이 아니면
                    if (arr[nr][nc] != opp) {
                        continue;
                    }

                    // 상대 돌을 확인하고 같은 방향으로 내 돌 찾기 위해 이동
                    nr += dr8[d];
                    nc += dc8[d];

                    while (nr >= 0 && nr < N && nc >= 0 && nc < N) {
                        // 놓여진 돌이 없으면
                        if (arr[nr][nc] == 0) {
                            break;
                        }
                        // 해당 좌표에 내 돌이 있으면
                        if (arr[nr][nc] == color) {
                            // 다시 왔던 방향으로 돌아가기
                            int fr = nr - dr8[d];
                            int fc = nc - dc8[d];
                            // 내가 시작했던 지점까지 확인하면서 내 돌로 바꾸기
                            while (fr != r || fc != c) {
                                arr[fr][fc] = color;
                                fr -= dr8[d];
                                fc -= dc8[d];
                            }
                            break;
                        }
                        // 상대 돌이면 한칸씩 계속 탐색
                        nr += dr8[d];
                        nc += dc8[d];
                    }
                }
            }
            int black = 0;
            int white = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) {
                        black++;
                    } else if (arr[i][j] == 2) {
                        white++;
                    }
                }
            }
            System.out.println("#" + tc + " " + black + " " + white);
        }
    }
}
