package 이코테.구현;

import java.util.*;
import java.io.*;

public class 음료수얼려먹기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Input = br.readLine();
        ArrayList<String> arr = new ArrayList<>();
        int ices = 0;
        while (!Input.isEmpty()) {
            arr.add(Input);
            Input = br.readLine();
        }
        int n = arr.size();
        int m = arr.get(0).length();
        int[][] matrix = new int[n][m];
        boolean[][] visisted = new boolean[n][m];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<arr.size(); i++) {
            for (int j=0; j<arr.get(i).length(); j++) {
                matrix[i][j] = arr.get(i).charAt(j);
            }
        }
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};


        while (!queue.isEmpty()) {
            queue.peek();
        }
    }
}
