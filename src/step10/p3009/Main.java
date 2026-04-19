package step10.p3009;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        ArrayList<Integer> xCoordinate = new ArrayList<>();
        ArrayList<Integer> yCoordinate = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            Integer x = Integer.parseInt(st.nextToken());
            Integer y = Integer.parseInt(st.nextToken());

            if(xCoordinate.contains(x)) {
                xCoordinate.remove(x);
            } else {
                xCoordinate.add(x);
            }

            if(yCoordinate.contains(y)) {
                yCoordinate.remove(y);
            } else {
                yCoordinate.add(y);
            }
        }

        bw.write(xCoordinate.get(0) + " " + yCoordinate.get(0));
        bw.flush();
        bw.close();
    }
}
