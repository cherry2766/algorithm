package SWEA.ironbar_5432;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * () 레이저, ( 막대기의 왼쪽 끝 ) 막대기의 오른쪽 끝
 * 문자열을 확인하면서
 * if ( 열린괄호를 만나면 스택에 push()
 *    ) 닫힌 괄호를 만나면 확인을 해야함
 *     문자열에서 현재 내 위치의 바로 앞에 문자가 ( 열린괄호면? 이건 레이저임
 *     레이저를 만나면 스택에서 pop()을 하고 레이저로 막대기를 다 잘라야하니까 스택의 길이를 조각에 ++
 *     내 위치의 바로 앞에 문자가 ) 닫힌 괄호면? 이건 레이저 아니고 막대기의 끝임 pop()하고 조각+1
 * */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine();

            // '(' 열린 괄호 임시 보관함
            Deque<Character> stack = new ArrayDeque<>();

            int piece = 0;

            for (int i = 0; i < str.length(); i++) {
                // ( 면 스택에 보관
                if (str.charAt(i) == '(') {
                    stack.push(str.charAt(i));
                } else {
                    // ) 면 내 바로 앞에 문자열 확인
                    if (str.charAt(i - 1) == '(') {
                        //이건 레이저임, pop 하고 막대기 전부 잘리니까 스택의 길이 계산
                        stack.pop();
                        piece += stack.size();
                    } else {
                        //이건 막대기의 끝, 끝날때 마지막 한 조각 +
                        stack.pop();
                        piece++;
                    }
                }
            }
            System.out.println("#" + tc + " " + piece);
        }
    }
}
