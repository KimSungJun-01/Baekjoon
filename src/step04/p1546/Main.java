package step04.p1546;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int score[] = new int[n];

        // 기존 점수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        // 최고점 선별
        int maxScore = score[0];
        for(int i = 1; i < n; i++) {
            if(score[i] > maxScore) {
                maxScore = score[i];
            }
        }

        // 조작된 점수 입력
        double result[] = new double[n];
        for(int i = 0; i < n; i++) {
            result[i] = (double) score[i] / maxScore * 100.0;
        }

        // 조작된 점수 평균 산출
        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += result[i];
        }
        double average = (double) sum / n;

        bw.write(String.valueOf(average));
        bw.flush();
        bw.close();
    }
}
