import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static int[][] merge(int[][] intervals) {

        int j = 0;

        for (int i = 1; i < intervals.length; i++) {
            System.out.println("I = " + i);
            System.out.println("J = " + j);

            if (intervals[j][1] > intervals[i][0]) {
                System.out.println("intervals[" + j + "][1] > intervals[" + i + "][0]");
                if (i < intervals.length - 1 && intervals[j][1] > intervals[i + 1][0]) {
                    System.out.println("intervals[" + j + "][1] > intervals[" + i + "][0]");
                    continue;
                }
                intervals[j][0] = intervals[j][0];
                intervals[j][1] = intervals[i][1];
                System.out.println("intervals[" + j + "][0] = intervals[" + j + "][0]");
                System.out.println("intervals[" + j + "][0] = intervals[" + i + "][0]");
            } else {
                j++;
                intervals[j][0] = intervals[i][0];
                intervals[j][1] = intervals[i][1];

                System.out.println("intervals[" + j + "][0] = intervals[" + j + "][0]");
                System.out.println("intervals[" + j + "][1] = intervals[" + i + "][1]");
            }
        }

        return intervals;
    }

    public static int[][] merge2(int[][] intervals) {

        int j = 0;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[j][1] >= intervals[i][0]) {
                // if (i < intervals.length - 1 && intervals[j][1] > intervals[i + 1][0]) {
                //     continue;
                // }
                intervals[j][0] = intervals[j][0];
                intervals[j][1] = intervals[i][1];
            } else {
                j++;
                intervals[j][0] = intervals[i][0];
                intervals[j][1] = intervals[i][1];
            }
        }


        return Arrays.copyOf(intervals, j);
    }

    public static void main(String[] args) {
        // System.out.println("Hello");
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        // int[][] intervals = { { 1, 4 }, { 4, 5 } };
        merge2(intervals);

        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }
    }
}