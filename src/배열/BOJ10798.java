package 배열;


import java.util.*;
import java.io.*;
public class BOJ10798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[5][15];

        for (int i=0; i<5; i++) {
            arr[i] = br.readLine().toCharArray();
            System.out.print(arr[i][5]);

        }



    }
}
