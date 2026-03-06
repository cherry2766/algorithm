package SWEA.safePassword_5658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 16진수 문자 개수
            int N = Integer.parseInt(st.nextToken());
            // 크기 순서 K번째로 큰 수
            int K = Integer.parseInt(st.nextToken());
            // 입력된 16진수 문자열을 문자 배열로 변환
            String str = br.readLine();
            char[] arr = str.toCharArray();
            // 중복 제거
            Set<String> set = new HashSet<>();

            Deque<Character> deque = new ArrayDeque<>();
            // 회전을 쉽게 하기 위해 deque에 문자 저장
            for (char c : arr) {
                deque.offerLast(c);
            }
            // 한 변의 길이만큼 회전하면서 모든 경우 확인
            for (int i = 0; i < N / 4; i++) {
                StringBuilder sb = new StringBuilder();

                Iterator<Character> iter = deque.iterator();
                int idx = 0;
                //deque 전체 순회
                while (iter.hasNext()) {
                    sb.append(iter.next());

                    idx++;

                    if (idx % (N / 4) == 0) {
                        // 한 덩어리가 완성되면 set에 문자열 넣고 sb는 비워주기(다음 덩어리 찾아야되니깐)
                        set.add(sb.toString());
                        sb.setLength(0);
                    }
                }
                deque.offerFirst(deque.pollLast());
            }

            List<Long> nums = new ArrayList<>();
            for (String s : set) {
                nums.add(Long.parseLong(s, 16));
            }

            nums.sort(Collections.reverseOrder());
            System.out.println("#" + tc + " " + nums.get(K - 1));

        }

    }
}
