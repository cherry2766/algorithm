package practice;

public class DeltaSearch {

    public DeltaSearch() {
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        // 우 하 좌 상
        // 방향을 이동시킬 델타 배열
        int[] dr = {0, 1, 0, -1}; // 행 이동 (상하)
        int[] dc = {1, 0, -1, 0}; // 열 이동 (좌우)

        // 델타를 품고 있는 행/열 반복문이 필요
        // 기준점을 잡고 그 다음에 4번 방향 탐색
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                // 기준점 [r][c]
                int cr = r;
                int cc = c;

                // 이제서야 델타 탐색 진행
                // 0 ~ 3
                for (int d = 0; d < 4; d++) {
                    int nr = cr + dr[d]; // 새로운 행의 좌표
                    int nc = cc + dc[d]; // 새로운 열의 좌표

                    // 유효성 검사
                    // 내가 새롭게 찾은 행과 열이 탐색 가능 범위이면 가
                    // 범위 안에 있으면
                    if (0 <= nr && nr < arr.length && 0 <= nc && nc < arr[r].length) {
                        arr[nr][nc] = 0;
                    }
                }
            }
        }
    }
}
