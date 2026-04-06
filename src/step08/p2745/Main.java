package step08.p2745;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        HashMap<Character, Integer> map = new HashMap<>();
        int j = 0;
        for(char i = '0'; i <= '9'; i++) {
            map.put(i, j++);
        }
        for(char i = 'A'; i <= 'Z'; i++) {
            map.put(i, j++);
        }

        int result = 0;
        int k = 0;
        for(int i = n.length() - 1; i >= 0; i--) {
            result += map.get(n.charAt(i)) * Math.pow(b, k++);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
