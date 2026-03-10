package SWEA_2068;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 개수 받기
		int T = sc.nextInt();

		// 테스트 케이스 반복
		for (int i = 1; i <= T; i++) {
			// 최대값 초기화
			int max = 0;

			// 숫자 10개 입력 반복하면서 최대값 비교
			for (int j = 1; j <= 10; j++) {
				int num = sc.nextInt();
				if (num > max) {
					max = num;
				}
			}
			System.out.println("#" + i + " " + max);
		}

		sc.close();

	}

}
