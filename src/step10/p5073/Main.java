package step10.p5073;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) break;
            if(isTriangle(a,b,c)) {
                if(a == b && b == c) {
                    bw.write("Equilateral\n");
                } else if(a == b || b == c || c == a) {
                    bw.write("Isosceles\n");
                } else {
                    bw.write("Scalene\n");
                }
            } else {
                bw.write("Invalid\n");
            }
        }

        bw.flush();
        bw.close();
    }

    public static boolean isTriangle(int a, int b, int c) {
        int sides[] = {a, b, c};
        Arrays.sort(sides);
        if(sides[2] < sides[0] + sides[1]) {
            return true;
        } else {
            return false;
        }
    }
}
