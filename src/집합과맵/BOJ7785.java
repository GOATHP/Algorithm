package 집합과맵;

import java.util.*;
import java.io.*;

public class BOJ7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();

            if (map.containsKey(key) ) {
                map.replace(key, value);
            } else {
                map.put(key, value);
            }
        }


        ArrayList<String> list = new ArrayList<>();

        for (String key : map.keySet() ) {
            if (map.get(key).equals("enter")) {
                list.add(key);
            };
        }

        Collections.sort(list, Collections.reverseOrder());

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
