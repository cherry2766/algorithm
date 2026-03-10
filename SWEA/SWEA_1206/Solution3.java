package SWEA_1206;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 테스트케이스 개수
		int T = 10;

		// 10번 반복하면서 건물의 개수만큼의 배열 만들기
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int[] h = new int[N];

			// 한 줄에 있는 건물 높이들을 나눌 준비
			StringTokenizer st = new StringTokenizer(br.readLine());

			// 각 건물의 높이를 배열에 저장
			for (int j = 0; j < N; j++) {
				int height = Integer.parseInt(st.nextToken());
				h[j] = height;
			}

			// 조망권 총합 초기화
			int viewCountSum = 0;

			// 맨 앞2개, 맨 뒤2개 빼고 반복하면서 현재 기준에서 양옆으로 2개씩 높이 찾기
			for (int k = 2; k < N - 2; k++) {
				int left2 = h[k - 2];
				int left1 = h[k - 1];
				int right1 = h[k + 1];
				int right2 = h[k + 2];

				// 4개 건물 높이 중 가장 높은 건물 찾기
				int viewHeight = left2;

				if (left1 > viewHeight) {
					viewHeight = left1;
				}

				if (right1 > viewHeight) {
					viewHeight = right1;
				}

				if (right2 > viewHeight) {
					viewHeight = right2;
				}

				// 인접한 4개 건물 중 가장 높은 건물보다 현재 건물 높이가 높으면 조망권 확보
				if (h[k] > viewHeight) {
					int viewCount = h[k] - viewHeight;
					viewCountSum += viewCount;
				}

			}
			System.out.println("#" + i + " " + viewCountSum);
		}

	}

}
