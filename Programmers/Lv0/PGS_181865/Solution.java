package Lv0.PGS_181865;

class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[2]);
        String op = arr[1];

        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default:
                return a * b;
        }
    }
}
