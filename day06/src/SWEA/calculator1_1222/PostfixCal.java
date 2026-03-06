package SWEA.calculator1_1222;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostfixCal {
    public static void main(String[] args) {
        String postFix = "35+2*";
        // 스택을 하나 만들어서 숫자를 가져올 예정
        Deque<Integer> numStack = new ArrayDeque<>();

        for (char c : postFix.toCharArray()) {
            // 숫자는 바로 push
            if (Character.isDigit(c)) {
                numStack.push(c - '0');
            } else {
                int b = numStack.pop();
                int a = numStack.pop();

                switch (c) {
                    case '*':
                        int mul = a * b;
                        numStack.push(mul);
                        break;
                    case '/':
                        int div = a / b;
                        numStack.push(div);
                        break;
                    case '+':
                        int plus = a + b;
                        numStack.push(plus);
                        break;
                    case '-':
                        int minus = a - b;
                        numStack.push(minus);
                        break;
                }
            }
        }
        numStack.pop();
    }
}
