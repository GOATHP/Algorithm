package 반복문;

import java.util.*;
import java.io.*;

public class BOJ25314 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

//        for (int i=0; i<n; i++) {
//            if (i == n-1) {
//                System.out.print("long int");
//            } else if (i % 4 == 0) {
//                System.out.print("long ");
//            }
//        }


//        int count = n / 4;
//        for (int i = 0; i < count; i++) {
//            System.out.print("long ");
//        }
//        System.out.println("int");

        int count = n / 4;  // 4바이트마다 long 하나

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append("long ");
        }

        sb.append("int");

        System.out.println(sb.toString());

    }
}
