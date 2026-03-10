package SWEA_1215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            // 회문의 길이
            int pLen = Integer.parseInt(br.readLine());
            char[][] arr = new char[8][8];
            // 8*8 배열 채우기
            for (int i = 0; i < 8; i++) {
                arr[i] = br.readLine().toCharArray();
            }
            int ans = 0;
            // 가로 탐색, 행 고정
            for (int r = 0; r < 8; r++) {
                // 열의 범위? 0 ~ 8 - 회문의 길이 <=
                for (int c = 0; c <= 8 - pLen; c++) {
                    // 회문 검사
                    // 열의 범위? 0 ~ 회문의 길이 <
                    boolean isPalindrome = true;
                    for (int j = 0; j < pLen / 2; j++) {
                        if (arr[r][c + j] != arr[r][c + pLen - 1 - j]) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome) {
                        ans++;
                    }
                }
            }
            // 세로 탐색, 열 고정
            for (int c = 0; c < 8; c++) {
                for (int r = 0; r <= 8 - pLen; r++) {
                    boolean isPalindrome = true;
                    for (int i = 0; i < pLen / 2; i++) {
                        if (arr[r + i][c] != arr[r + pLen - 1 - i][c]) {
                            isPalindrome = false;
                            break;
                        }
                    }
                    if (isPalindrome) {
                        ans++;
                    }
                }
            }
            System.out.println("#" + tc + " " + ans);
        }
    }


}
