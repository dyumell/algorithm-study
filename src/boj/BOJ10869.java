package boj;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class BOJ10869 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");

        System.out.println(String.valueOf((Integer.parseInt(inputs[0])+Integer.parseInt(inputs[1]))));
        System.out.println(String.valueOf((Integer.parseInt(inputs[0])-Integer.parseInt(inputs[1]))));
        System.out.println(String.valueOf((Integer.parseInt(inputs[0])*Integer.parseInt(inputs[1]))));
        System.out.println(String.valueOf((Integer.parseInt(inputs[0])/Integer.parseInt(inputs[1]))));
        System.out.println(String.valueOf((Integer.parseInt(inputs[0])%Integer.parseInt(inputs[1]))));
    }
}
