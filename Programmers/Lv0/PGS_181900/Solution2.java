package Lv0.PGS_181900;

class Solution2 {
    public String solution(String my_string, int[] indices) {
        // 삭제할 인덱스를 검사할 배열 만들기
        boolean[] remove = new boolean[my_string.length()];

        for (int idx : indices) {
            // true : 삭제할 인덱스
            remove[idx] = true;
        }

        StringBuilder result = new StringBuilder();

        // remove 배열에서 false인 인덱스만 이어 붙이기
        for (int i = 0; i < my_string.length(); i++) {
            if (!remove[i]) {
                result.append(my_string.charAt(i));
            }
        }
        return result.toString();
    }
}
