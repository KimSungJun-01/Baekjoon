package step06.p2941;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        StringBuilder sb = new StringBuilder(word);
        String croatia2[] = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        String croatia3 = "dz=";

        int count = 0;

        while(sb.indexOf(croatia3) != -1) {
            count++;
            sb.replace(sb.indexOf(croatia3), sb.indexOf(croatia3) + 3, "*");
        }

        for(int i = 0; i < croatia2.length; i++) {
            while(sb.indexOf(croatia2[i]) != -1) {
                count++;
                sb.replace(sb.indexOf(croatia2[i]), sb.indexOf(croatia2[i]) + 2, "*");
            }
        }

        for(int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i) != '*') {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
