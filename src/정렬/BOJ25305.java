package 정렬;

import java.util.*;
import java.io.*;

public class BOJ25305 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(list.size() - index) );


    }

}
