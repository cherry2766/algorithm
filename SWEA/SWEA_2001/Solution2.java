package SWEA_2001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int max = 0;
			// 파리채 놓는 위치 좌표
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {

					int sum = 0;
					// 위치(i,j)에서 M*M 안의 모든 칸 더하기
					for (int k = i; k < i + M; k++) {
						for (int l = j; l < j + M; l++) {
							sum += arr[k][l];
						}
					}
					max = Math.max(max, sum);
				}
			}

			System.out.println("#" + tc + " " + max);
		}

	}

}
