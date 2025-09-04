package 이코테.이진탐색;

import java.util.*;
import java.io.*;

public class 부품찾기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrN = new int[n];
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arrM = new int[m];
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arrN);

        for (int i=0; i<m; i++) {
            System.out.print(binarySearch(arrN, arrM[i], 0, arrN.length-1));
        }

    }
    public static String binarySearch(int[] factory, int target, int left, int right) {

        int mid = left + (right - left) / 2;
        System.out.println("mid ======++> " + mid);
        System.out.println("mid Value ======++> " + factory[mid]);
        System.out.println("target ======++> " + target);
        System.out.println("right ======++> " + right);
        System.out.println("left ======++> " + left);

        if (left < right) {
            if (target == factory[mid]) {
                return "YES ";
            } else if (target > factory[mid]) {
                return binarySearch(factory, target, mid + 1, right);
            } else if (target < factory[mid]) {
                return binarySearch(factory, target, left, mid - 1);
            }
            return "NO ";
        } else {
            return "NO ";
        }
    }
}
