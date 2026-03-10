package SWEA_19003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 문자열 개수
            int N = Integer.parseInt(st.nextToken());
            // 문자열 길이
            int M = Integer.parseInt(st.nextToken());

            List<String> arr = new ArrayList<>();
            // 리스트에 문자열 전부 저장
            for (int i = 0; i < N; i++) {
                arr.add(br.readLine());
            }
            // 팰린드롬이 아닌 문자열 저장
            List<String> nonPalArr = new ArrayList<>();
            // 문자열 1개 그 자체로 팰린드롬이면 그 문자열 중에 1개만 필요하니까
            // 왜냐면? abc    cba 가 있을때 팰린드롬 문자열을 가운데 넣으면 그냥 팰린드롬임
            // 그래서 문자열 1개씩 보고 팰린드롬이 있으면 그냥 그 길이 값을 저장하면 될듯..?
            int midLen = 0;
            // 팰린드롬이 아닌 문자열이면? 뒤집어서 봤을때 전체 리스트 중에 같은게 있는지 확인
            // 있으면 문자열을 이어붙이면(짝꿍) 팰린드롬이니까 그 길이 값을 저장할 변수
            int palLen = 0;
            int maxLen = 0;

            // 일단 전체 리스트를 하나씩 살펴보면서
            for (int i = 0; i < N; i++) {
                String str = arr.get(i);
                // 그 문자열 각각이 팰린드롬인지 아닌지 확인
                // 팰린드롬이 아니면 리스트에 우선 저장
                if (!isPal(str)) {
                    nonPalArr.add(str);
                    // 팰린드롬이면? 그냥 그 길이 값 저장
                } else {
                    midLen = M;
                }
            }
            // 팰린드롬이 아닌 리스트에서 하나씩 확인해볼건데 (짝 찾기)
            // 이미 확인한 인덱스는 다시 보면 안됨 visited 배열 이용
            boolean[] visited = new boolean[nonPalArr.size()];

            // 팰린드롬이 아니면? 팰린드롬이 아닌 리스트를 확인하면서
            // 그 값을 reverse 했을 때 리스트에 같은 값이 있는지 확인
            for (int i = 0; i < nonPalArr.size(); i++) {
                // 방문 안했으면 ? 방문해야함
                if (!visited[i]) {
                    // 문자열 하나 가져와서
                    String str = nonPalArr.get(i);
                    // 뒤집기
                    String reversed = new StringBuilder(str).reverse().toString();
                    // 뒤집은 문자열이 있는 인덱스 찾기
                    int idx = nonPalArr.indexOf(reversed);
                    // idx가 -1이 아니여야 찾은거임, 방문하지 않은 곳만 봐야함, 나 자신은 제외하고 봐야함(중복 문자가 없으니까 없어도되나?)
                    if (idx != -1 && !visited[idx] && i != idx) {
                        // 여기서 찾은 인덱스는 방문했으니까 true로 바꿔줘야 함, 짝꿍 둘다 방문!
                        visited[i] = true;
                        visited[idx] = true;
                        // 같은 값이 있다면? 2개 문자열을 합쳐서 팰린드롬이고 문자열 길이는 같으니까 M*2
                        palLen += M * 2;
                    }
                }

            }
            // 그 다음에 합친 문자열 길이랑 팰린드롬인 길이를 더하면 최대길이
            maxLen = midLen + palLen;
            System.out.println("#" + tc + " " + maxLen);

        }
    }

    // 여기 팰린드롬인지 확인할 메서드 하나 만들자
    public static boolean isPal(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
