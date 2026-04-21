package step10.p9063;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int xList[] = new int[n];
        int yList[] = new int[n];

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            xList[i] = Integer.parseInt(st.nextToken());
            yList[i] = Integer.parseInt(st.nextToken());
        }

        int xMin = 10000;
        int xMax = -10000;
        int yMin = 10000;
        int yMax = -10000;
        for(int i = 0; i < n; i++) {
            if(xList[i] < xMin) xMin = xList[i];
            if(xList[i] > xMax) xMax = xList[i];
            if(yList[i] < yMin) yMin = yList[i];
            if(yList[i] > yMax) yMax = yList[i];
        }

        int result = (xMax - xMin) * (yMax - yMin);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
