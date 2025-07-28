package 심화1;

import java.util.*;
import java.io.*;

public class BOJ3003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] chess = new int[6];
        int[] answer = new int[6];

        chess[0] = 1;
        chess[1] = 1;
        chess[2] = 2;
        chess[3] = 2;
        chess[4] = 2;
        chess[5] = 8;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = 0;
        for (int i=0; i<6; i++){

            n = Integer.parseInt(st.nextToken());

            answer[i] = chess[i] - n;
        }

        for (int i=0; i<6; i++){
            System.out.print(answer[i]+" ");
        }
    }
}
