package 조건문;

import java.util.*;
import java.io.*;

public class BOJ2525 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());



        if ( b + c >= 60 ) {
            a += ( b + c ) / 60;
            if ( a >= 24 ) {
                a -= 24;
                System.out.println(a + " " + ( b + c ) % 60);
            } else {
                System.out.println(a + " " + ( b + c ) % 60);
            }
        } else {
            System.out.println(a + " " + ( b + c ));
        }





    }
}
