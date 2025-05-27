import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] diff;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] spots = new int[n + 2];
        for (int i = 1; i < n + 1; i++) {
            spots[i] = Integer.parseInt(st.nextToken());
        }
        spots[n + 1] = l;

        Arrays.sort(spots);

        diff = new int[n + 1];
        for (int i = 1; i < spots.length; i++) {
            diff[i - 1] = spots[i] - spots[i - 1];
        }

        Arrays.sort(diff);

//        for (int i = 0; i < diff.length; i++) {
//            System.out.print(diff[i] + " ");
//        }
//        System.out.println();

        int left = l / (n + m + 1);
        int right = findMax(diff);
        int mid = (left + right) / 2;
        while (left <= right) {
//            System.out.println("---");
//            System.out.println(left + " " + mid + " " + right);
            if (possibleMax(mid, m)) {
//                System.out.println("true");
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
//            System.out.println(left + " " + mid + " " + right);
        }
        System.out.println(mid + 1);
    }

    private static boolean possibleMax(int val, int m) {
        // m번 이하로 쪼개서 diff의 최댓값이 val이 되도록 만들수있는지?
        int cnt = 0;
        for (Integer num : diff) {
            while (num > val) {
                num -= val;
                cnt++;
            }
            if (cnt > m) {
                return false;
            }
        }
        return true;
    }

    private static int findMax(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }
}
