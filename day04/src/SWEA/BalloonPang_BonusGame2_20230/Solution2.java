package SWEA.BalloonPang_BonusGame2_20230;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 강사님 풀이
// 행과 열이 다 터지는거니깐
// 1. r, c 간단하게
// r행 다 더해주고
// c열 다 더해주고
// 내가 있던 r,c 값은 한번 빼주고!!
// max값 비교

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            // 기본 풍선 배열이 있음 N*N
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            for (int r = 0; r < N; r++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    arr[r][c] = Integer.parseInt(st.nextToken());
                }
            }

            // 2. 델타 탐색으로 풀어보기
            // 상 하 좌 우 탐색을 할건데...
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};

            int max = Integer.MIN_VALUE;
            // 1. 원본의 데이터 순회 반복 2개 필요
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    // 현재 나의 위치에서의 최대값 초기화
                    int myMax = arr[r][c];

                    // 2. 4방향 탐색을 먼저 시작하고
                    for (int d = 0; d < 4; d++) {
                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        // 조건문을 바로 써도 괜찮지만
                        // 결국 이동을 끝까지 해야하기 때문에
                        // if + for 섞인 while
                        // - 0 미만, N-1 이상이면 더이상 갈 수 없으니
                        //   - 내가 전진한 방향은 더이상 탐색 하지마!
                        while (0 <= nr && nr < N && 0 <= nc && nc < N) {
                            // 범위 들어왔고 값을 더해줘
                            myMax += arr[nr][nc];
                            // 조건의 갱신 범위가 없으면 무한 반복
                            // d 값은 어느 방향으로 갈지 알려주는 인덱스
                            // nr, nc 값 갱신
                            nr += dr[d];
                            nc += dc[d];
                        }
                    } // delta 끝
                    // max값 갱신
                    max = Math.max(myMax, max);
                }
            }
            System.out.println("#" + tc + " " + max);

        } //tc 끝
    }
}

        /*

           나의 위치 값은 더해주고 시작



         */