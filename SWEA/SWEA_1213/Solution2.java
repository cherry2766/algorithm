package SWEA_1213;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// indexOf() 로 풀어보기
public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = 10;

        for (int tc = 1; tc <= T; tc++) {
            int tcNum = Integer.parseInt(br.readLine());
            // 찾을 문자열
            String search = br.readLine();
            // 전체 문자열
            String str = br.readLine();

            // 전체 문자열에서 찾을 문자열이 총 몇번 나왔는지 찾을건데..
            // indexOf를 사용해서 찾아보자
            // indexOf는 str.indexOf(search) 했을 때 처음부터 값을 찾으니깐
            // 처음 값을 찾으면 해당하는 idx+1 값을 str.indexOf(search, 요기에 넣어)
            // 찾을 때마다 인덱스 값을 찾은 인덱스값의 바로 다음 번째로 바꿔줘야 함
            // 찾을 때마다 cnt 값을 ++ 해줘서 세야함

            int cnt = 0;
            int idx = 0;

            while (true) {
                idx = str.indexOf(search, idx);

                if (idx == -1) {
                    break;
                }
                idx++;
                cnt++;
            }
            System.out.println("#" + tcNum + " " + cnt);
        }
    }
}
