package 정렬;

import java.util.*;
import java.io.*;

public class BOJ11650 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for(int i =0; i < n; i++) {
            ArrayList<Integer> arr2 = new ArrayList<>();
            arr.add(arr2);
        }

        for(int i =0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr.get(m).add(k);
        }
        Collections.sort(arr, (a, b) -> {
            if (a.get(0) == b.get(0)){
               return a.get(1) - b.get(1);
            } return a.get(0) - b.get(0);
        });

        for(int i =0; i < n; i++) {
            for (int j = 0; arr.get(j).size() < n; j++) {
                System.out.println(arr.get(i) + " " + arr.get(i).get(j));
            }

        }
    }
}
