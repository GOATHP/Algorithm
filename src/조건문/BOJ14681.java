package 조건문;

import java.util.*;
import java.io.*;

public class BOJ14681 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if ( ( x > 0 ) & ( y > 0 ) ) {
            System.out.println("1");
        } else if ( ( ( x > 0 ) & ( y < 0 ) ) ) {
            System.out.println("4");
        } else if ( ( ( x < 0 ) & ( y > 0 ) ) ) {
            System.out.println("2");
        } else  {
            System.out.println("3");
        }

    }

}
