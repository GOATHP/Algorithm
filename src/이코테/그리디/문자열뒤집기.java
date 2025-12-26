package 이코테.그리디;

import java.util.*;
import java.io.*;

public class 문자열뒤집기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int cnt = 0;
        int result = 0;
        int first = st.charAt(0) - 0;
        for (int i=1; i<st.length(); i++) {
            if (st.charAt(i) - 0 != first) {
                cnt = 1;
                first = st.charAt(i) - 0;
            }
        }
    }
}
