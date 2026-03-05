package SWEA.calculator1_1222;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    // 우선 순위 비교하기 위한 메서드
    public static int prec(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 후위 표기식으로 바꾸기
        // 숫자는 push, 아니면 pop() 2번 해서 꺼낸 순서가 뒤로가게 놓고 계산, 계산하고 다시 푸쉬
        int result = 0;
        for (int tc = 1; tc <= 10; tc++) {
            int len = Integer.parseInt(br.readLine());
            String str = br.readLine();

            Deque<Integer> stack = new ArrayDeque<>();
            for (char c : str.toCharArray()) {
                // 숫자이면?
                if (Character.isDigit(c)) {
                    stack.push(c - '0');
                } else {
                    // 하나 뺐는데 비어있으면 어케댐?
                    if (!stack.isEmpty()) {
                        int b = stack.pop();
                        int a = stack.pop();
                        int cal = a + b;

                        stack.push(cal);

                    }
                }
            }
            if (!stack.isEmpty()) {
                result = stack.pop();
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
