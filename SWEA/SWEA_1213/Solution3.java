package SWEA_1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 강사님 풀이
public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc < 10; tc++) {
            br.readLine(); // 내가 읽어온 값 들어갈 자리가 없음
            //패턴
            String pattern = br.readLine();
            //원본
            String text = br.readLine();
            // 패턴의 개수를 세어주기 위해서
            int ans = 0;
            // 원본 전체를 돌 예정, 원본의 길이 - 패턴의 길이까지만 보려고 함
            for (int i = 0; i <= text.length() - pattern.length(); i++) {
                // 패턴 검색시 필요한 cnt 초기화
                int cnt = 0;
                // 패턴 값을 비교해줘야 하는데...
                for (int j = 0; j < pattern.length(); j++) {
                    // i와 j 비교해서 문자 비교 필요
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        // 값이 다르면
                        break;
                    }
                    //값이 같으면 cnt 올려주기
                    cnt++;
                }
                if (cnt == pattern.length()) {
                    ans++;
                }
            }
            System.out.println("#" + tc + " " + ans);
        }
    }
}
