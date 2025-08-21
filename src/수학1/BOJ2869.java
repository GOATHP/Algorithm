package 수학1;

import java.util.*;
import java.io.*;

public class BOJ2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int days = 0;
        int height = 0;

//        while (height < v) {
//            height += a;
//            if (height >= v) {
//                days += 1;
//                break;
//            }
//            height -= b;
//            days += 1;
//        }
//
//        System.out.println(days);
//
        System.out.println( (v + b) - a);
    }
}
