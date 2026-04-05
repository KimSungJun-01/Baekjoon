package step07.p2563;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int paper[][] = new int[100][100];

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < (x + 10); j++) {
                for(int k = y; k < (y + 10); k++) {
                    paper[j][k] = 1;
                }
            }
        }

        int size = 0;
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                if(paper[i][j] == 1) {
                    size++;
                }
            }
        }

        bw.write(String.valueOf(size));
        bw.flush();
        bw.close();
    }
}
