package SWEA_25052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 4방향 델타 배열
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            for (int r = 0; r < N; r++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int c = 0; c < N; c++) {
                    arr[r][c] = Integer.parseInt(st.nextToken());
                }
            }
            // 전체 경로 중 최대값 저장
            int max = Integer.MIN_VALUE;
            // 기준점 찾기, 모든 좌표를 시작점으로 탐색
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {

                    // 현재 좌표에서 탐색 시작
                    int cr = r;
                    int cc = c;
                    // 경로 길이, 시작점 포함
                    int len = 1;

                    // 4방향 탐색해서 낮은 경로 없으면 반복 종료, 이동할 수 있을때까지 반복
                    while (true) {
                        // 가장 낮은 값에 일단 현재 값 넣어놓고
                        int minVal = arr[cr][cc];
                        // 다음 이동할 좌표(아직 이동할 곳이 없음)
                        int nextR = -1, nextC = -1;
                        // 4방향 탐색 시작
                        for (int d = 0; d < 4; d++) {
                            int nr = cr + dr[d];
                            int nc = cc + dc[d];
                            // 범위 체크
                            if (0 <= nr && nr < N && 0 <= nc && nc < N) {
                                // 더 낮은값이면 갱신
                                if (arr[nr][nc] < minVal) {
                                    minVal = arr[nr][nc];
                                    nextR = nr;
                                    nextC = nc;
                                }
                            }
                        }
                        // 4방향 탐색했는데 낮은값이 없으면 종료, 다음 좌표로 이동
                        if (nextR == -1) {
                            break;
                        }
                        // 좌표 바꿔주기, 다음 위치로
                        cr = nextR;
                        cc = nextC;
                        // 1칸 갔으니까 경로 길이 증가
                        len++;

                    }
                    // 경로 길이의 최대값 갱신
                    max = Math.max(max, len);
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
