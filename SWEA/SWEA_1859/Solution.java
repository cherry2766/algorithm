package SWEA_1859;

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
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.valueOf(st.nextToken()));
            }

            long profit = 0;
            int max = list.get(N - 1);

            for (int i = N - 2; i >= 0; i--) {
                if (max < list.get(i)) {
                    max = list.get(i);
                } else {
                    profit += max - list.get(i);
                }
            }
            System.out.println("#" + tc + " " + profit);
        }
    }
}
