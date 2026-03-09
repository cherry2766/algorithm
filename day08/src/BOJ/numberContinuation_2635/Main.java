package BOJ.numberContinuation_2635;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 가장 긴 수열을 저장할 리스트
        List<Integer> maxNums = new ArrayList<>();

        // 두 번째 수를 1부터 N까지 바꿔가며 수열 생성
        for (int i = 1; i <= N; i++) {

            List<Integer> nums = new ArrayList<>();

            nums.add(N);
            nums.add(i);

            while (true) {
                int size = nums.size();
                int nextNum = nums.get(size - 2) - nums.get(size - 1);

                // 다음 수가 음수가 되면 종료
                if (nextNum < 0) break;

                nums.add(nextNum);
            }
            // 현재 수열이 더 길면 리스트 갱신
            if (maxNums.size() < nums.size()) {
                maxNums = nums;
            }
        }
        System.out.println(maxNums.size());
        for (int num : maxNums) {
            System.out.print(num + " ");
        }

    }
}
