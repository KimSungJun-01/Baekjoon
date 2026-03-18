package step04.p10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int list[] = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        int max = list[0];
        int min = list[0];
        for(int i = 1; i < n; i++) {
            if(list[i] > max) {
                max = list[i];
            }
            if(list[i] < min) {
                min = list[i];
            }
        }

        bw.write(String.valueOf(min + " " + max));
        bw.flush();
        bw.close();
    }
}
