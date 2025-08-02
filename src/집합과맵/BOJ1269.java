package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ1269 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setTemp = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++) {
            int value = Integer.parseInt(st2.nextToken());
            setA.add(value);
            setTemp.add(value);
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for (int i=0;i<m;i++) {
            setB.add(Integer.parseInt(st3.nextToken()));
        }

        setA.removeAll(setB);
        setB.removeAll(setTemp);

        System.out.println(setA.size() + setB.size());
    }

}
