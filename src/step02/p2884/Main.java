package step02.p2884;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m >= 45 ) {
            bw.write(String.valueOf(h + " " + (m - 45)));
        } else {
            if (h < 1) {
                bw.write(23 + " " + String.valueOf(60 - (45 - m)));
            } else {
                bw.write(String.valueOf((h - 1) + " " + (60 - (45 - m))));
            }
        }

        bw.flush();
        bw.close();
    }
}
