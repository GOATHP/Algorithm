package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i=1;i<=n;i++) {
            String pokemon = br.readLine();
            map.put(i,pokemon);
            map2.put(pokemon, i);
        }
        for (int i=0;i<m;i++) {
            String key = br.readLine();
            System.out.println(key);
            System.out.println(key.matches("[A-Z&&[a-z]]\t" ));
            if ( key.matches("\\D" ) ) {
                System.out.println(map2.get(key));
            } else if ( key.matches("\\d" )) {
                    int numKey = Integer.parseInt(key);
                    System.out.println(map.get(numKey));
                }

        }
    }
}
