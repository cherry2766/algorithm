package Bronze.BOJ_2525;

import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int time = (A * 60) + B + C;

        int hour = (time / 60) % 24;
        int minute = time % 60;

        System.out.println(hour + " " + minute);

    }
}