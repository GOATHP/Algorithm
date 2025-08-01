package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ1764 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (int i=0; i<n+m; i++) {
            String key = br.readLine();
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
                if (map.get(key) >= 2) {
                    list.add(key);
                }
            } else {
                map.put(key, 1);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for (int i=0; i<list.size();i++) {
            System.out.println(list.get(i));
        }

    }
}
