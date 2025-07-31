package 정렬;

import java.util.*;
import java.io.*;

public class BOJ10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][3];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = String.valueOf(st.nextToken());
            String name = st.nextToken();

            arr[i] = new String[]{String.valueOf(i), age ,name};
        }
        Arrays.sort(arr, (a, b)->{
            if (a[1] == b[1]) {
                return ( Integer.compare ( Integer.parseInt(a[0]),  Integer.parseInt(b[0]) ) );
            } else {
                return Integer.compare ( Integer.parseInt(a[1]),  Integer.parseInt(b[1]) );
            }
        });

        for (int i=0; i<n; i++) {
            System.out.println(arr[i][1] + " " + arr[i][2]);
        }
    }

}
