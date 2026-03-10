package SWEA_1984;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 입력 받기
		int T = sc.nextInt();

		// 테스트 케이스 개수 만큼 반복
		for (int i = 1; i <= T; i++) {
			// 입력 범위가 0~10000이므로
			// 초기값 설정
			int max = 0;
			int min = 10001;
			int sum = 0;

			// 숫자 10개 입력 반복하면서 최대값, 최소값 비교 후 변경
			for (int j = 1; j <= 10; j++) {
				int num = sc.nextInt();

				if (num > max) {
					max = num;
				}
				if (num < min) {
					min = num;
				}
				// 전부 더하기
				sum += num;

			}
			// 10개 더한 값에서 최대값, 최소값 빼고 8개로 나누기
			double avg = (sum - max - min) / 8.0;
			// 소수점 첫째자리에서 반올림해서 정수로 출력
			int result = (int) Math.round(avg);
			System.out.println("#" + i + " " + result);
		}

	}

}
