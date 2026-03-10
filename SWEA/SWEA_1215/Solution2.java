package SWEA_1215;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            // 회문의 길이
            int P = Integer.parseInt(br.readLine());
            // 8*8
            char[][] arr = new char[8][];
            for (int i = 0; i < 8; i++) {
                arr[i] = br.readLine().toCharArray();
            }

            int ans = 0;
            // 가로 기준 탐색
            // 1. r 행 탐색
            for (int r = 0; r < 8; r++) {
                //  2. c 열 탐색 0~ 8-회문의 길이까지 포함
                for (int c = 0; c <= 8 - P; c++) {
                    //  3. j 진짜 회문을 찾을 예정
                    //       0~ 회문의 길이/2 <
                    int cnt = 0; // 회문을 세어줄 개수
                    for (int j = 0; j < P / 2; j++) {
                        //      (r,c+j)
                        //      (r,c+회문의길이-1-j)
                        if (arr[r][c + j] != arr[r][c + P - 1 - j]) {
                            break;
                        }
                        cnt++;
                    }
                    if (cnt == P / 2) {
                        ans++;
                    }
                }

            }
            // 세로 기준 탐색
            // 1. c 열 탐색
            for (int c = 0; c < 8; c++) {
                //  2. c 열 탐색 0~ 8-회문의 길이까지 포함
                for (int r = 0; r <= 8 - P; r++) {
                    //  3. i 진짜 회문을 찾을 예정
                    //       0~ 회문의 길이/2 <
                    int cnt = 0; // 회문을 세어줄 개수
                    for (int i = 0; i < P / 2; i++) {
                        //      (r+j,c)
                        //      (r+회문의길이-1-i,c)
                        if (arr[r + i][c] != arr[r + P - 1 - i][c]) {
                            break;
                        }
                        cnt++;
                    }
                    if (cnt == P / 2) {
                        ans++;
                    }
                }
            }
            System.out.println("#" + tc + " " + ans);
        }
    }
}
