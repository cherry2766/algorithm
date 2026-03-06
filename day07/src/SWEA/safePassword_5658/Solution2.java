package SWEA.safePassword_5658;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 강사님 풀이
public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            String input = br.readLine();
            char[] ch = input.toCharArray();

            // 자료 타입을 활용해서 중복을 제거할 16진수 모음집
            // 숫자 변환은 아직 안하고 문자열로 만들어줄 예정
            // 집합 - 중복되는 원소는 알아서 안넣어줌
            Set<String> set = new HashSet<>();

            // str로 가져온 원본값을 deque에 넣어주기
            // 회전을 위해서 queue를 쓰자!
            Deque<Character> deque = new ArrayDeque<>();
            for (char c : ch) {
                deque.offerLast(c);
            }
            // 탐색할 준비완료
            // N만큼 들어올 예정
            // 4변 N/4-1 회전
            // N/4번까지 회전할 필요가 없음 (원본과 동일)
            // 3회전만 하는 것이 아님!!
            for (int i = 0; i < N / 4; i++) {
                // 16진수를 만들어주기 위한 StringBuilder
                StringBuilder sb = new StringBuilder();

                // deque를 반복문처럼 돌리기 위해서는 iterator() 순회를 할 수 있게 도와주는 메서드
                Iterator<Character> iter = deque.iterator();
                int idx = 0;

                // hasNext() 뒤에 값이 있으면 고 없으면 스탑!
                // N/4 개씩 블록 생성
                while (iter.hasNext()) {
                    // deque 하나 뽑아서 sb에 넣어주기
                    sb.append(iter.next());
                    // 지금 인덱스꺼 일단 넣어줬으니까 idx + 1
                    idx++;
                    // 내가 바라보고 있는 인덱스의 값이
                    // 인덱스 % (N/4) == 0
                    if (idx % (N / 4) == 0) {
                        // 덩어리 완성되면 그때 set에 추가
                        set.add(sb.toString());
                        // sb를 초기화 setLength()
                        sb.setLength(0);
                    }
                }
                //제일 뒤에 있는 원소를 제일 앞으로 넣어줄 것
                // 뭐든지 .. deque의 제일 앞에 삽입
                // offerFirst // enqueue 제일 뒤에 넣어주는 것 rear
                // pollLast // dequeue 제일 앞에 있는거 삭제해줘 front
                deque.offerFirst(deque.pollLast());
            } // 회전 끝

            // 16진수를 10진수로 바꿔줘야 함!
            List<Long> numbers = new ArrayList<>();
            for (String hex : set) {
                // Long.parseLong(16진수 값, 16진수);
                numbers.add(Long.parseLong(hex, 16));
            }
            // 정렬 내림차순으로 정렬해주고 K-1번째 값을 가져올 것
            numbers.sort(Collections.reverseOrder());

            System.out.println("#" + tc + " " + numbers.get(K - 1));
        }// tc 끝

    }


}
