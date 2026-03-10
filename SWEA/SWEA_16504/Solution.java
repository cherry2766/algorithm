package SWEA_16504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			int[] arr = new int[N];

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				int h = Integer.parseInt(st.nextToken());
				arr[i] = h;
			}

			int fallMax = 0;

			for (int i = 0; i < N - 1; i++) {
				int fall = 0;
				for (int j = i + 1; j < N; j++) {
					if (arr[i] > arr[j]) {
						fall++;
					}
				}

				fallMax = Math.max(fallMax, fall);
			}
			System.out.println("#" + tc + " " + fallMax);

		}

	}

}
