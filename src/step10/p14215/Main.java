package step10.p14215;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sides[] = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < sides.length; i++){
            sides[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sides);

        while(true) {
            if(sides[0] + sides[1] > sides[2]) break;
            sides[2]--;
        }

        bw.write(String.valueOf(sides[0] + sides[1] + sides[2]));
        bw.flush();
        bw.close();
    }
}
