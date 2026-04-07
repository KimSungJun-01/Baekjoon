package step08.p2903;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int list[] = new int[16];
        list[0] = 2;
        for(int i = 1; i < 16; i++) {
            list[i] = list[i - 1] + (int)Math.pow(2, i - 1);
        }

        bw.write(String.valueOf((int)Math.pow(list[n], 2)));
        bw.flush();
        bw.close();
    }
}
