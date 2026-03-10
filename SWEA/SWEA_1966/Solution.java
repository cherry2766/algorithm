package SWEA_1966;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                list.add(Integer.valueOf(st.nextToken()));
            }

            Collections.sort(list);

            System.out.print("#" + tc + " ");
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
