package SWEA_1206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// 바이트를 문자열로 변환
		InputStreamReader isr = new InputStreamReader(System.in);
		// 덩어리째 가져옴
		BufferedReader br1 = new BufferedReader(isr);
//		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		// 한 줄 가져옴

		String i1 = br1.readLine();

		// 하나씩 탐색해서 살펴봄
		StringTokenizer st1 = new StringTokenizer(br1.readLine());
		StringTokenizer st2 = new StringTokenizer(i1);

		String s = st1.nextToken();
		int i = Integer.parseInt(st1.nextToken());

	}
}
