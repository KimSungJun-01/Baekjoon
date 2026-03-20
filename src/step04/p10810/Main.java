package step04.p10810;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 인덱스 0 ~ n 까지의 바구니 생성
        int bucket[] = new int[n + 1];

        // 바구니 내용물 0으로 초기화
        for(int a = 0; a <= n; a++) {
            bucket[a] = 0;
        }

        // m번 반복으로 범위와 공 숫자 받기
        for(int a = 0; a < m; a++) {
            st = new StringTokenizer(br.readLine());

            int i =  Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // 인덱스 i~j까지에 숫자 k 공 넣기
            for(int b = i; b <= j; b++) {
                bucket[b] = k;
            }
        }

        // 바구니 출력
        for(int a = 1; a <= n; a++) {
            bw.write(String.valueOf(bucket[a] + " "));
        }

        bw.flush();
        bw.close();
    }
}
