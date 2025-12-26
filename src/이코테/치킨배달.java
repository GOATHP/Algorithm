//package 이코테;
//
//import java.util.*;
//import java.io.*;
//
//public class 치킨배달 {
//    static int n, m;
//    static ArrayList<int[]> chXY = new ArrayList<>();
//    static ArrayList<int[]> homeXY = new ArrayList<>();
//    static boolean[] selected;
//    static int answer = Integer.MAX_VALUE;
//
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        n = Integer.parseInt(st.nextToken());
//        m = Integer.parseInt(st.nextToken());
//        int[][] city = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            StringTokenizer st2 = new StringTokenizer(br.readLine());
//            for (int j = 0; j < n; j++) {
//                city[i][j] = Integer.parseInt(st2.nextToken());
//            }
//        }
//
//        int chCnt = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (city[i][j] == 2) {
//                    chCnt++;
//                    chXY.add(new int[]{i, j});
//                } else if (city[i][j] == 1) {
//                    homeXY.add(new int[]{i, j});
//                }
//            }
//        }
//
//        selected = new boolean[chXY.size()];
//
//        dfs(0,0);
//
//
//    }
//        static int distFind() {
//            int chDist = 0;
//                for (int i = 0; i < homeXY.size(); i++) {
//                    int minDist = Integer.MAX_VALUE;
//                    int x = homeXY.get(i)[0];
//                    int y = homeXY.get(i)[1];
//
//                    for (int j = 0; j < chXY.size(); j++) {
//                        if (selected[j]) {
//                            int hx = chXY.get(j)[0];
//                            int hy = chXY.get(j)[1];
//                            int dist = Math.abs(x - hx) + Math.abs(y - hy);
//                            minDist = Math.min(dist, minDist);
//                        }
//                    }
//                    chDist += minDist;
//                }
//            return chDist;
//        }
//
//        List<int[]> listArr  = new ArrayList<>();
//        public static void dfs(int idx, int cnt) {
//
//
//            if (idx == chXY.size()) {
//                if (cnt == m) answer = Math.min(answer, distFind());
//                return;
//            }
//
//            if (cnt > m) {return};
//
//            selected[idx] = true;
//            dfs(idx+1, cnt+1);
//
//            selected[idx] = false;
//            dfs(idx+1, cnt);
//
//            return;
//        }
//
//
//        public static void perm(int depth) {
//
//
//        }
//    }
//}
