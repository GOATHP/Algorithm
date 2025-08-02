package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ14425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());



        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        HashMap<String, Integer> map = new HashMap<>();

        String[] arr = new String[n];
        for (int i=0;i<n;i++){
            map.put(br.readLine(),0);
        }

        for (int i=0;i<m;i++) {
            String key = br.readLine();
            if (map.containsKey(key)) {
                count++;
            }
        }


        System.out.println(count);
    }

}
