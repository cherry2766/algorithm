package SWEA.patternlength_2007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 패턴의 마디 길이, 패턴의 반복되는 부분
// 앞 문자열 equals 뒤 문자열이면 그 사이가 마디
// 1 2 3 4 | 1 2 3 4 이러면 마디 길이는 4
//  1 2 3 4 5 6 7 8 < 사이사이가 마디
// 1부터 최대 마디의 길이 10만큼 반복하면서
// 0~마디길이의 값이랑 마디길이~마디길이*2가 같은지 확인
// 같으면 그 길이가 답
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine();

            int patternLen = 0;

            for (int len = 1; len <= 10; len++) {
                if (str.substring(0, len).equals(str.substring(len, len * 2))) {
                    patternLen = len;
                    break;
                }
            }
            System.out.println("#" + tc + " " + patternLen);
        }
    }
}
