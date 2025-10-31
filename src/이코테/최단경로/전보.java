package 이코테.최단경로;

import java.util.*;
import java.io.*;


class Node implements Comparable<Node> {

    int dist;
    int idx;

    public Node(int dist, int idx) {

        this.dist = dist;
        this.idx = idx;

    }

    @Override
    public int compareTo(Node o) {
        return this.dist - o.dist;
    }
}

public class 전보 {



}
