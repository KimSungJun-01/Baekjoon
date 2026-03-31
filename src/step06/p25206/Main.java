package step06.p25206;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double sum = 0.0;
        double sumCredits = 0.0;
        for(int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credits = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(conversionGradePoint(grade) < 0) {
                continue;
            }

            sum += credits * conversionGradePoint(grade);
            sumCredits += credits;
        }
        double result = sum / sumCredits;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    public static double conversionGradePoint(String grade) {
        double point = 0.0;
        switch(grade) {
            case "A+":
                point = 4.5;
                break;
            case "A0":
                point = 4.0;
                break;
            case "B+":
                point = 3.5;
                break;
            case "B0":
                point = 3.0;
                break;
            case "C+":
                point = 2.5;
                break;
            case "C0":
                point = 2.0;
                break;
            case "D+":
                point = 1.5;
                break;
            case "D0":
                point = 1.0;
                break;
            case "F":
                point = 0.0;
                break;
            case "P":
                point = -1;
                break;
        }
        return point;
    }
}
