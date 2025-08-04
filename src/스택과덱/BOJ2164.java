package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ2164 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i=0;i<n;i++) {
            queue.add(i+1);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.addLast(queue.poll());
        }

        System.out.println(queue.peek());
    }

}
