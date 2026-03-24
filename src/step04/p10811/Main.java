package step04.p10811;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n  = Integer.parseInt(st.nextToken());
        int m  = Integer.parseInt(st.nextToken());

        // 바구니 초기화
        int bucket[] = new int[n + 1];
        for(int a = 1; a <= n; a++) {
            bucket[a] = a;
        }

        // i, j 입력받고 바구니 역순 정렬
        for(int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());
            int i =  Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            while(true) {
                if(i >= j) {
                    break;
                }
                int temp = bucket[i];
                bucket[i] = bucket[j];
                bucket[j] = temp;
                i++; j--;
            }
        }

        for(int a = 1; a <= n; a++) {
            bw.write(bucket[a] + " ");
        }

        bw.flush();
        bw.close();
    }
}
