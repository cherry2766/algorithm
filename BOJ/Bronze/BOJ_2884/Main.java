package Bronze.BOJ_2884;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int alarmTime = ((H * 60) + M) - 45;
        // 음수가 나오면 안되니까 하루 더해주기
        if (alarmTime < 0) {
            alarmTime += 24 * 60;
        }

        int hour = alarmTime / 60;
        int minute = alarmTime % 60;

        System.out.println(hour + " " + minute);
    }
}