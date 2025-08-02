package 브루트포스;

import java.util.*;
import java.io.*;

public class BOJ2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int target = Integer.parseInt(n);
        int answer = 0;

        int partSum = 0;
        int min = Integer.MAX_VALUE;
        while (target <= 0) {

        int power = n.length();
        int remain = target;

            for (int i = power - 1; i >= 0; i--) {
                int div = (int) Math.pow(10,i);
//                System.out.println( remain );
                partSum +=  ( remain / div );
                System.out.println(partSum);
                remain -= (remain / div) * div;
            }

            if (remain + partSum == target && min > remain + partSum) {
                min = remain;
                target--;
            } else if (remain + partSum < target){
                System.out.println(remain);
                break;

            } else {
                target--;
            }

            System.out.println(remain);

        }

    }

}
