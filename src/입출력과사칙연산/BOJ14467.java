package 입출력과사칙연산;

import java.util.*;
import java.io.*;

public class BOJ14467 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();

        int cnt = 0;
        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cows = Integer.parseInt(st.nextToken());
            int road = Integer.parseInt(st.nextToken());

            if (map.containsKey(cows) && map.get(cows) != road) {
                cnt += 1;
            }

            map.put(cows, road);


        }

        System.out.println(cnt);

    }
}