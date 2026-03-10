package SWEA_1926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            int num = i;
            // 3/6/9가 몇개 들어있는지 체크
            int cnt = 0;
            // 각 자리수 확인하면서 검사
            while (num != 0) {
                int n = num % 10;

                if (n == 3 || n == 6 || n == 9) {
                    cnt++;
                }
                num /= 10;
            }

            // 숫자에 3,6,9가 들어있으면
            if (cnt > 0) {
                // 들어있는 갯수에 맞게 - 넣기
                for (int k = 0; k < cnt; k++) {
                    sb.append("-");
                }
                // 숫자에 3이 없으면 그대로 출력
            } else {
                sb.append(i);
            }
            // 사이에 공백
            if (i < N) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
