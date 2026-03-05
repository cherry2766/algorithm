package SWEA.calculator1_1222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();
            String inFix = br.readLine();

            // 1) 중위에서 후위로 바꾸기
            StringBuilder postFix = new StringBuilder();
            Deque<Character> stack = new ArrayDeque<>();

            for (int i = 0; i < inFix.length(); i++) {
                char c = inFix.charAt(i);
                // 숫자면 그냥 출력
                if (Character.isDigit(c)) {
                    postFix.append(c);
                    // 연산자가 + 밖에 없으니까 다 빼야겠네?
                } else if (c == '+') {
                    while (!stack.isEmpty()) {
                        postFix.append(stack.pop());
                    }
                    stack.push(c);
                }
            }
            while (!stack.isEmpty()) postFix.append(stack.pop());

            // 2) 후위식 계산
            Deque<Integer> stack2 = new ArrayDeque<>();
            for (int i = 0; i < postFix.length(); i++) {
                char c = postFix.charAt(i);
                // 숫자면 스택에 넣고
                if (Character.isDigit(c)) {
                    stack2.push(c - '0');
                } else { // 연산자면 피연산자 2개 빼서 계산하고 다시 넣기, b가 오른쪽, a가 왼쪽 피연산자
                    int b = stack2.pop();
                    int a = stack2.pop();
                    stack2.push(a + b);
                }
            }

            int result = stack2.pop();
            System.out.println("#" + tc + " " + result);
        }
    }
}
