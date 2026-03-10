package SWEA_1860;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 손님 수
            int N = Integer.parseInt(st.nextToken());
            // M초마다 붕어빵 만드는 중
            int M = Integer.parseInt(st.nextToken());
            // M초에 만들 수 있는 붕어빵 개수
            int K = Integer.parseInt(st.nextToken());

            // 손님이 도착한 시간을 저장하는 배열
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            // 도착 시간 정렬
            Arrays.sort(arr);
            boolean result = true;
            // 손님이 도착할 때마다 확인, 조건이 모든 손님에게 참이여야 함, 모두 받아야 하니까
            // 그때까지 나온 붕어빵 개수 >= 손님의 수
            for (int i = 0; i < N; i++) {
                if (arr[i] / M * K < i + 1) {
                    result = false;
                    break;
                }
            }
            if (result) {
                System.out.println("#" + tc + " Possible");
            } else {
                System.out.println("#" + tc + " Impossible");
            }
        }
    }
}
