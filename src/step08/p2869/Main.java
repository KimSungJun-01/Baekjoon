package step08.p2869;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        double day = (double)(v - a) / (a - b);

        if((v - a) == 0) {
            day = 1;
        } else if((v - a) % (a - b) == 0) {
            day++;
        } else {
            day += 2;
        }

        bw.write(String.valueOf((int)day));
        bw.flush();
        bw.close();
    }
}
