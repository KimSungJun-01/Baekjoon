package step07.p2566;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int matrix[][] = new int[9][9];
        int max = 0;
        int row = 1;
        int col = 1;

        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());

                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i + 1;
                    col = j + 1;
                }
            }
        }

        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(row + " " + col));
        bw.flush();
        bw.close();
    }
}
