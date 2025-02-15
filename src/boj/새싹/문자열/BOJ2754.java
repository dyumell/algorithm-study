package boj.새싹.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2754 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String grade = br.readLine();
        float avg = switch (grade) {
            case "A+" -> 4.3f;
            case "A0" -> 4.0f;
            case "A-" -> 3.7f;
            case "B+" -> 3.3f;
            case "B0" -> 3.0f;
            case "B-" -> 2.7f;
            case "C+" -> 2.3f;
            case "C0" -> 2.0f;
            case "C-" -> 1.7f;
            case "D+" -> 1.3f;
            case "D0" -> 1.0f;
            case "D-" -> 0.7f;
            case "F" -> 0.0f;
            default -> 0;
        };

        System.out.println(avg);
    }
}
