package step02.p2525;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =  Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());

        if ((b + c) >= 60) { // 분이 60을 넘기는 경우
            a = a + ((b + c) / 60);
            if (a >= 24) { // 시가 24를 넘어가는 경우
                bw.write(String.valueOf((a % 24) + " " + ((b + c) % 60)));
            } else { // 시가 24를 넘어가지 않는 경우
                bw.write(String.valueOf(a + " " + ((b + c) % 60)));
            }
        } else { // 분이 60을 넘기지 않는 경우
            bw.write(String.valueOf(a + " " + (b + c)));
        }

        bw.flush();
        bw.close();
    }
}
