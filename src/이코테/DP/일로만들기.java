package 이코테.DP;

import java.util.*;
import java.io.*;

public class 일로만들기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MIN_VALUE;

        System.out.println(divBy(n, 0));

    }


    public static int divBy(int n, int cnt) {
        if (n == 1) {
            return cnt;
            }
            return cnt;


        }
    }

