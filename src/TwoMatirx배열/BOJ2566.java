package TwoMatirx배열;

import java.util.*;
import java.io.*;

public class BOJ2566 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int indexX = 0;
        int indexY = 0;

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            matrix.add(new ArrayList<>());
        }

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                matrix.get(i).add(Integer.parseInt(st.nextToken()));;
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (matrix.get(i).get(j) >= max) {
                    max = matrix.get(i).get(j);
                    indexX = i+1;
                    indexY = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(indexX + " " + indexY);
    }
}
