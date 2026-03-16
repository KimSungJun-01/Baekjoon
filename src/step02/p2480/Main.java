package step02.p2480;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int prize = 0;

        if (a == b && b == c) {
            prize = 10000 + (a * 1000);
        } else if (a == b) {
            prize = 1000 + (a * 100);
        } else if (b == c) {
            prize = 1000 + (b * 100);
        } else if (c == a) {
            prize = 1000 + (c * 100);
        } else {
            prize = max(a, b, c) * 100;
        }

        bw.write(String.valueOf(prize));
        bw.flush();
        bw.close();
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
