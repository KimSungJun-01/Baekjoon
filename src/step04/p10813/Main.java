package step04.p10813;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int bucket[] = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            bucket[i] = i;
        }

        for(int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = bucket[i];
            bucket[i] = bucket[j];
            bucket[j] = temp;
        }

        for(int i = 1; i <= n; i++) {
            bw.write(String.valueOf(bucket[i] + " "));
        }

        bw.flush();
        bw.close();
    }
}
