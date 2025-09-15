package 이코테.구현;

import java.util.*;
import java.io.*;

public class 시각 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cnt = 0;

        for (int i = 0; i<=n; i++) {
            if ( String.valueOf(i).contains("3") ){
                cnt = cnt + 3600;
                continue;
            }
            System.out.println(i);
            for (int j = 0; j<60; j++) {
                if ( String.valueOf(j).contains("3") ){
                    cnt = cnt + 60;
                    continue;
                }
                for (int k = 0; k<60; k++) {
                    if ( String.valueOf(k).contains("3") ){
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);


//        int cnt = 0;
//
//        for (int i = 0; i <= n; i++) {
//            if (i == 3 || i == 13 || i == 23) {
//                for (int j = 0; j < 60; j++) {
//                    for (int k = 0; k < 60; k++) {
//                        cnt += 1;
//                    }
//                }
//            } else {
//                for (int j = 0; j < 60; j++) {
//                    if (String.valueOf(j).contains("3")) {
//                        for (int k = 0; k < 60; k++) {
//                            cnt += 1;
//                        }
//                    } else {
//                        for (int k = 0; k < 60; k++) {
//                            if (String.valueOf(k).contains("3")) {
//                                cnt +=1;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        System.out.println(cnt);
        }
    }


