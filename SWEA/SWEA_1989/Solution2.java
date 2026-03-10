package SWEA_1989;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 2. 투포인터를 사용해서 str.charAt[i] == str.charAt[문자열 길이-1-i]로 비교
public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine();
            boolean result = true;

            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    result = false;
                }
            }

            if (result) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
}

