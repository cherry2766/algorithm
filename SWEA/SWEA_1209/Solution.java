package SWEA_1209;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			// 테스트 케이스 번호
			int testCaseNum = Integer.parseInt(br.readLine());

			// 100*100 2차원 배열
			int[][] arr = new int[100][100];
			for (int i = 0; i < 100; i++) {
				// 한 줄 전체를 읽어와서 공백 기준으로 잘라서 저장
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					int num = Integer.parseInt(st.nextToken());
					arr[i][j] = num;
				}

			}

			int maxRowSum = getMaxRowSum(arr);

			int maxColSum = getMaxColSum(arr);

			int maxDiagonalSum = getMaxDiagonalSum(arr);

			int maxNum = Math.max(Math.max(maxRowSum, maxColSum), maxDiagonalSum);

			System.out.println("#" + tc + " " + maxNum);

		}

	}

	// 행의 합 중의 최대값
	public static int getMaxRowSum(int[][] arr) {
		int maxRowSum = 0;

		for (int i = 0; i < 100; i++) {
			int rowSum = 0;
			for (int j = 0; j < 100; j++) {
				rowSum += arr[i][j];
			}
			maxRowSum = Math.max(maxRowSum, rowSum);
		}
		return maxRowSum;
	}

	// 열의 합 중의 최대값
	public static int getMaxColSum(int[][] arr) {
		int maxColSum = 0;

		for (int j = 0; j < 100; j++) {
			int colSum = 0;
			for (int i = 0; i < 100; i++) {
				colSum += arr[i][j];
			}
			maxColSum = Math.max(maxColSum, colSum);
		}
		return maxColSum;
	}

	// 주대각선/부대각선의 합 중의 최대값
	public static int getMaxDiagonalSum(int[][] arr) {
		int mainSum = 0; // 주대각선
	    int subSum = 0;  // 부대각선

	    for (int i = 0; i < 100; i++) {
	        mainSum += arr[i][i];
	        subSum += arr[i][99 - i];
	    }

		return Math.max(mainSum, subSum);
	}
}
