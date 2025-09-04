package 이코테.정렬;

import java.util.*;
import java.io.*;

public class 떡볶이떡만들기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] riceCakes = new int[n];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            riceCakes[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(riceCakes);
        int[] cutting = new int[riceCakes[riceCakes.length-1] - riceCakes[0] + 1 ];

        for (int i=riceCakes[0] - riceCakes[0]; i<riceCakes[riceCakes.length-1] - riceCakes[0] +1; i++) {
            cutting[i] = riceCakes[0]+i;
            System.out.println(cutting[i]);
        }


        System.out.println(cutRiceCake(riceCakes, cutting, m, 0, cutting.length));
    }

    public static int cutRiceCake(int[] riceCakes, int[] cutting, int target, int left, int right) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        int sum = 0;

        for(int i=0; i<riceCakes.length; i++) {
            if ( riceCakes[i] - cutting[mid] > 0 ) {
                sum += riceCakes[i] - cutting[mid];
            }
        }
        if (sum == target) {
            return cutting[mid];
        } else if (sum < target) {
            return cutRiceCake(riceCakes, cutting, target, mid + 1, right);
        } else {
            return cutRiceCake(riceCakes, cutting, target, left, mid - 1);
        }

    }

}
