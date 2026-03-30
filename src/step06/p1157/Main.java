package step06.p1157;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        word = word.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < word.length(); i++) {
            if(map.containsKey(word.charAt(i))) {
                int count = map.get(word.charAt(i));
                count++;
                map.put(word.charAt(i), count);
            } else {
                map.put(word.charAt(i), 1);
            }
        }

        if(word.length() == 1) {
            bw.write(word);
        } else {
            Iterator<Character> keySetIterator = map.keySet().iterator();
            char maxChar = 0;
            int maxCount = 0;

            while(keySetIterator.hasNext()) {
                Character key = keySetIterator.next();

                if(map.get(key) > maxCount) {
                    maxChar = key;
                    maxCount = map.get(key);
                } else if (map.get(key) == maxCount) {
                    maxChar = '?';
                }
            }

            bw.write(maxChar);
        }

        bw.flush();
        bw.close();
    }
}
