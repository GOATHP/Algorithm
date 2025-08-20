package 배열;


import java.util.*;
import java.io.*;
public class BOJ10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];
        int[] len = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine().toCharArray();
            len[i] = arr[i].length;

        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < arr[j].length) {
                    System.out.print(arr[j][i]);
                }
            }
        }
    }
}
