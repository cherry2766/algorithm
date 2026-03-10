package SWEA_6190;

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

            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                nums.add(Integer.valueOf(st.nextToken()));
            }
            int max = -1;

            for (int i = 0; i < nums.size(); i++) {
                for (int j = i + 1; j < nums.size(); j++) {
                    int mul = nums.get(i) * nums.get(j);

                    String str = String.valueOf(mul);
                    boolean ans = true;

                    for (int k = 0; k < str.length() - 1; k++) {
                        if (str.charAt(k) > str.charAt(k + 1)) {
                            ans = false;
                            break;
                        }
                    }
                    if (ans) {
                        max = Math.max(max, Integer.parseInt(str));
                    }
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
