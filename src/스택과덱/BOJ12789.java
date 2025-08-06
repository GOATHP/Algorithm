package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ12789 {
<<<<<<< Updated upstream

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        int[] arr = new int[n];
        int[] orderedArr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            orderedArr[i] = i+1;
        }
        int target = 1;

        while (target == n) {

            for (int i=0; i<n; i++) {
                if ( arr[i] != target ){
                    dq.push(arr[i]);
                } 
            }
        }
=======
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> orderedArr = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i=0; i<n; i++) {
            arr.add(Integer.parseInt(st.nextToken()) );
            orderedArr.add(i+1);
        }

        for (int i=0; i<n; i++) {
            if (arr.get(i) == orderedArr.get(0) ) {
                orderedArr.remove(0);
            } else if (arr.get(i) == orderedArr.get(orderedArr.size()-1) ){
                stack.push(arr.get(i));
                orderedArr.remove(orderedArr.size()-1);
            }
        }

        if (orderedArr.size() != 0) {
            System.out.println("nice");
        } else {
            System.out.println("nice");
        }
>>>>>>> Stashed changes
    }
}
