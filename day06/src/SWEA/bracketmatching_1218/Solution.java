package SWEA.bracketmatching_1218;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 괄호 종류 () [] {} <> 여는 괄호는 전부 push 닫는 괄호는 pop인데 내 짝이랑 맞는지 확인 해야 함
        for (int tc = 1; tc <= 10; tc++) {
            int tcLen = Integer.parseInt(br.readLine());
            String str = br.readLine();
            Deque<Character> stack = new ArrayDeque<>();
            boolean result = true;
            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[' || c == '{' || c == '<') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    char open = stack.pop();
                    if (c == ')' && open != '(') result = false;
                    if (c == ']' && open != '[') result = false;
                    if (c == '}' && open != '{') result = false;
                    if (c == '>' && open != '<') result = false;

                    if (!result) break;
                }
            }
            if (!stack.isEmpty()) {
                result = false;
            }
            if (result) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
}
