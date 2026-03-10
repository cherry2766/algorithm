package SWEA_1989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열을 입력 받고 회문이면 1 아니면 0 출력
        // 1. reverse로 문자열을 뒤집고 같은지 비교

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {

            String str = br.readLine();
            String reversed = new StringBuilder(str).reverse().toString();

            if (str.equals(reversed)) {
                System.out.println("#" + tc + " " + 1);
            }else {
                System.out.println("#" + tc + " " + 0);
            }

        }
    }
}
