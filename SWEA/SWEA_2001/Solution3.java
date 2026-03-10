package SWEA_2001;

import java.util.Scanner;

// 강사님 풀이
public class Solution3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			// 바둑판 크기
			int N = sc.nextInt();
			// 파리채 크기
			int M = sc.nextInt();

			int[][] board = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					board[i][j] = sc.nextInt();
				}
			}

			int max = Integer.MIN_VALUE;

			for (int r = 0; r <= N - M; r++) {
				for (int c = 0; c <= N - M; c++) {
					// 여기까지가 지금 내가 탐색할 시작점을 정한 것
					// 이제부터 잡을 것
					// 이 자리부터 M*M 잡았을 때 몇마리인지 카운트할 변수
					// (r,c)
					int fly = 0;
					for (int y = r; y < r + M; y++) {
						for (int x = c; x < c + M; x++) {
							fly += board[y][x];
						}

					}

					max = Math.max(max, fly);
				}
			}
			System.out.println("#" + tc + " " + max);

		}

	}

}