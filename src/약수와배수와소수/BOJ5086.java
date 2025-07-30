package 약수와배수와소수;

import java.util.*;
import java.io.*;

public class BOJ5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println( (32 / 4) % 4 );
        System.out.println( (12 / 3) % 3 );
        System.out.println( (32 % 4) % 4 );
        System.out.println( (6 % 8) % 8 );

        String input = "";

        while ( true ) {
            input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            } else if (a % b == a) {
                System.out.println("factor");
            } else if ( (a%b) % b == 0 ){
                System.out.println("multiple");
            } else if ((a%b) % b != 0 ) {
                System.out.println("neither");
            } else {
                System.out.println("neither");
            }
        }
    }
}
