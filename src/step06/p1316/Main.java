package step06.p1316;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for(int i = 0; i < n; i++) {
            String word = br.readLine();

            HashSet<Character> group = new HashSet<>();
            group.add(word.charAt(0));
            boolean isGroup = true;
            for(int j = 1; j < word.length(); j++) {
                if(word.charAt(j - 1) != word.charAt(j)) {
                    if(group.contains(word.charAt(j))) {
                        isGroup = false;
                        break;
                    } else {
                        group.add(word.charAt(j));
                    }
                }
            }

            if(isGroup) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
