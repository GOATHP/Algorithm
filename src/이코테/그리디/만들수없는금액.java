package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 만들수없는금액 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] coins = new int[n];
        int min = 0;
        int max = 0;
        Arrays.sort(coins);
        for (int i=0; i<coins.length; i++) {
           max += coins[i];
        }
        for (int i=1;i<=max;i++) {
            int sum = 0;
        }
    }
}
