package 스택과덱;

import java.util.*;
import java.io.*;

public class BOJ11866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken())-1;
        int tempIdx = idx;
        LinkedList<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder();

        for (int i=1;i<=n;i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            if (queue.size() >= idx) {
                if ( queue.size() == n ) {
                    sb.append("<"+queue.get(idx)+", ");
                } else {
                    sb.append(queue.get(idx)+", ");
                }
                queue.remove(idx);
                idx += tempIdx;
            } else if (queue.size() < idx) {
                if (queue.size() <= tempIdx) {
                    if (queue.size() == 1) {
                        sb.append(queue.poll()+">");
                    } else {
                        sb.append(queue.poll()+", ");
                    }
                } else {
                    idx = Math.abs(idx) - queue.size();
                    queue.get(idx);
                    sb.append(queue.get(idx)+", ");
                    queue.remove(idx);
                    idx += tempIdx;
                }
            }
        }
        System.out.println(sb);
    }
}
