package 반복문;

import java.util.*;
import java.io.*;

public class BOJ8393 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int m = 0;

        for (int i = 1; i < n+1; i++){
            m += i;
        }
        System.out.println(m);
    }

}
