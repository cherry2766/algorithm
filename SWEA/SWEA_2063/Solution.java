package SWEA_2063;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] scores = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			scores[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(scores);

		int mid = N / 2;
		int score = scores[mid];

		System.out.println(score);

	}
}
