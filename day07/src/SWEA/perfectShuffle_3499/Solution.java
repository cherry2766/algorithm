package SWEA.perfectShuffle_3499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            // 카드 덱 입력
            String[] cardDeck = br.readLine().split(" ");
            // 덱을 두 부분으로 나누기 위한 중간 인덱스
            int mid = (N + 1) / 2;

            System.out.print("#" + tc + " ");
            // 앞쪽 카드와 뒤쪽 카드를 번갈아 출력
            for (int i = 0; i < mid; i++) {
                // 앞쪽 카드 출력
                System.out.print(cardDeck[i] + " ");
                // 뒤쪽 카드가 존재할 때만 출력 (홀수 카드 처리)
                if (i + mid < N) {
                    System.out.print(cardDeck[i + mid] + " ");
                }
            }
            System.out.println();
        }
    }
}
