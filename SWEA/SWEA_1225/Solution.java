package SWEA_1225;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int tc = 1; tc <= 10; tc++) {
            br.readLine();

            StringTokenizer st = new StringTokenizer(br.readLine());

            Queue<Integer> queue = new ArrayDeque<>();

            for (int i = 0; i < 8; i++) {
                queue.offer(Integer.valueOf(st.nextToken()));
            }

            boolean stop = false;

            while (true) {
                for (int i = 1; i <= 5; i++) {
                    int num = queue.poll();
                    if (num - i <= 0) {
                        num = 0;
                        queue.offer(num);
                        stop = true;
                        break;
                    }
                    queue.offer(num - i);
                }
                if (stop) break;
            }

            System.out.print("#" + tc + " ");
            while (!queue.isEmpty()) {
                System.out.print(queue.poll() + " ");
            }
            System.out.println();
        }
    }
}
