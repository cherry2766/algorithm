package SWEA_1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//substring() 으로 풀어보기

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 10;

        for (int tc = 1; tc <= 10; tc++) {
            int tcNum = Integer.parseInt(br.readLine());
            // 찾을 문자열
            String search = br.readLine();
            // 전체 문자열
            String str = br.readLine();

            int cnt = 0;
            for (int i = 0; i <= str.length()-search.length(); i++) {
                String word = str.substring(i, i + search.length());
                if (search.equals(word)) {
                    cnt++;
                }

            }
            System.out.println("#" + tcNum + " " + cnt);

        }
    }
}
