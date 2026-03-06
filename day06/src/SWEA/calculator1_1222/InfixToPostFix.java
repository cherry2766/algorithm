package SWEA.calculator1_1222;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// 강사님 풀이
public class InfixToPostFix {
    public static void main(String[] args) {
        // 입력 받을 내용은 중위 표기식
        String inFix = "3+5+2";
        // 후위 연산으로 바꾼 작업을 입력받을 StringBuilder
        StringBuilder postFix = new StringBuilder();
        // 스택을 하나 만들어서 연산자를 가져올 예정
        Deque<Character> opStack = new ArrayDeque<>();
        // <key type, value type> value에 우선순위가 들어감
        Map<Character, Integer> prec = new HashMap<>();

        prec.put('*', 2);
        prec.put('/', 2);

        prec.put('+', 1);
        prec.put('-', 1);

        prec.put('(', 0);

        for (char c : inFix.toCharArray()) {
            // 숫자(피연산자)가 나오면 출력
            if (Character.isDigit(c)) {
                postFix.append(c);
            }
            // 문자(연산자)가 나오면 스택에 push
            else {
                // 스택이 비어있는지 체크 필수
                if (opStack.isEmpty()) {
                    opStack.push(c);
                } else {
                    // ( 열린 괄호 나왔으면 일단 바로 push()
                    if (c == '(') {
                        opStack.push(c);
                        // ) 닫힌 괄호 나오면 ( 나올때까지 pop()
                    } else if (c == ')') {
                        // 조건 + 반복 while
                        // 내가 바라보고 있는 top이 ( 만나기 전까지만 반복
                        while (opStack.peek() != '(') {
                            postFix.append(opStack.pop());
                        }
                        opStack.pop();
                    } else {
                        char top = opStack.peek(); // 스택 top값
                        char cur = c; // 내가 바라보는 값
                        if (prec.get(top) < prec.get(cur)) {
                            opStack.push(cur);
                        } else if (prec.get(top) >= prec.get(cur)) {
                            // 스택의 top은 pop() 해서 문자열에 넣어주고
                            postFix.append(opStack.pop());
                            // 현재 내가 만난 문자는 push()
                            opStack.push(cur);
                        }
                    }
                }
            }
        }
        // 현재 만난 문자(연산자)가
        // 스택의 top의 연산자보다 우선순위가 낮으면 push()

        // 스택의 top 연산자가
        // 현재 내가 만난 문자보다 우선순위가 같거나 크면 pop()
    }
}
