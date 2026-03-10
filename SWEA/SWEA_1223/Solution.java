package SWEA_1223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
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

        for (int tc = 1; tc <= 10; tc++) {
            int len = Integer.parseInt(br.readLine());
            String inFix = br.readLine();
            // 중위를 후위로 바꾸기
            // 후위식 결과를 계속 이어붙일 문자열
            StringBuilder postFix = new StringBuilder();
            // 스택 만들기, 연산자 보관함
            Deque<Character> stack = new ArrayDeque<>();

            for (char c : inFix.toCharArray()) {
                //숫자인지 아닌지 확인, 숫자면 바로 출력
                if (Character.isDigit(c)) {
                    postFix.append(c);
                    // 숫자가 아니면 연산자라는거임, 고민 시작..
                    // 스택이 비어있지 않고, 괄호가 아니여야 하고, 스택의 맨 위 연산자가 나보다 우선순위가 >= 이면? 빼고 넣어야 함
                } else if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {
                    // ( 만날때까지 계속 pop해서 출력 , ( 만나면 얘는 빼서 버리기
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postFix.append(stack.pop());
                    }
                    if (!stack.isEmpty()) stack.pop();
                } else {
                    while (!stack.isEmpty() && stack.peek() != '(' && prec(stack.peek()) >= prec(c)) {
                        postFix.append(stack.pop());
                    }
                    stack.push(c);
                }

            }
            while (!stack.isEmpty()) {
                postFix.append(stack.pop());
            }

            // 출력해야 해..
            int result = 0;
            Deque<Integer> stack2 = new ArrayDeque<>();

            for (int i = 0; i < postFix.length(); i++) {
                char c = postFix.charAt(i);
                if (Character.isDigit(c)) {
                    stack2.push(c - '0');
                } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                    int b = stack2.pop();
                    int a = stack2.pop();
                    // 연습이니까 연산자 다 해보기,,
                    int cal = 0;
                    switch (c) {
                        case '+':
                            cal = a + b;
                            break;
                        case '-':
                            cal = a - b;
                            break;
                        case '*':
                            cal = a * b;
                            break;
                        case '/':
                            cal = a / b;
                            break;
                    }
                    stack2.push(cal);
                }
            }
            if (!stack2.isEmpty()) {
                result = stack2.pop();
            }
            System.out.println("#" + tc + " " + result);
        }
    }
}
