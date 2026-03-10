package SWEA_1224;

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

            StringBuilder postFix = new StringBuilder();

            Deque<Character> stack = new ArrayDeque<>();

            for (char c : inFix.toCharArray()) {

                if (Character.isDigit(c)) {
                    postFix.append(c);

                } else if (c == '(') {
                    stack.push(c);
                } else if (c == ')') {

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

            int result = 0;
            Deque<Integer> stack2 = new ArrayDeque<>();

            for (int i = 0; i < postFix.length(); i++) {
                char c = postFix.charAt(i);
                if (Character.isDigit(c)) {
                    stack2.push(c - '0');
                } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                    int b = stack2.pop();
                    int a = stack2.pop();

                    int cal = 0;
                    switch (c) {
                        case '+':
                            cal = a + b;
                            break;
                        case '*':
                            cal = a * b;
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
