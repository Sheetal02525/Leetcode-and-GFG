import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
                List<Integer> integerList = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        int sr = 0;
        int er = n - 1;
        int sc = 0;
        int ec = m - 1;

        while (sr <= er && sc <= ec) {
            // printing top elements
            for (int j = sc; j <= ec; j++) {
                integerList.add(arr[sr][j]);
            }

            // printing right elements
            for (int i = sr + 1; i <= er; i++) {
                integerList.add(arr[i][ec]);
            }

            // printing bottom elements
            if (sr < er) {
                for (int j = ec- 1; j >= sc; j--) {
                    integerList.add(arr[er][j]);
                }
            }

            // printing left elements
            if (sc < ec) {
                for (int i = er - 1; i >= sr + 1; i--) {
                    integerList.add(arr[i][sc]);
                }
            }

            sc++;
            sr++;
            ec--;
            er--;
        }

        return integerList;

    }
}
