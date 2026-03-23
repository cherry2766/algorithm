package Lv1.PGS_42862;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Set<Integer> lostSet = new HashSet<>();
        for (int i : lost) {
            lostSet.add(i);
        }

        Set<Integer> reserveSet = new HashSet<>();
        for (int i : reserve) {
            reserveSet.add(i);
        }

        for (int i = 0; i < lost.length; i++) {
            if (reserveSet.contains(lost[i])) {
                lostSet.remove(lost[i]);
                reserveSet.remove(lost[i]);
            }
        }

        int max = n - lostSet.size();

        for (int num : lostSet) {
            if (reserveSet.contains(num - 1)) {
                max++;
                reserveSet.remove(num - 1);
            } else if (reserveSet.contains(num + 1)) {
                max++;
                reserveSet.remove(num + 1);
            }
        }
        return max;

    }
}
