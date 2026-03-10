package SWEA_1208;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = 10;

		for (int i = 1; i <= T; i++) {
			int dumpCount = Integer.parseInt(br.readLine());
			// 상자의 높이 1~100가 idx인 배열
			int[] cnt = new int[101];

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int j = 0; j < 100; j++) {
				int height = Integer.parseInt(st.nextToken());
				cnt[height]++;

			}

			for (int k = 0; k < dumpCount; k++) {
				int maxIndex = 100;
				while (cnt[maxIndex] == 0) {
					maxIndex--;
				}
				int minIndex = 1;
				while (cnt[minIndex] == 0) {
					minIndex++;
				}

				if (maxIndex - minIndex <= 1) {
					break;
				}

				cnt[maxIndex]--;
				cnt[maxIndex - 1]++;

				cnt[minIndex]--;
				cnt[minIndex + 1]++;
			}

			int maxIndex = 100;
			while (cnt[maxIndex] == 0) {
				maxIndex--;
			}
			int minIndex = 1;
			while (cnt[minIndex] == 0) {
				minIndex++;
			}
			System.out.println("#" + i + " " + (maxIndex - minIndex));

		}

	}

}
