package boj.새싹.반복;

import java.io.*;

public class BOJ10951 {
    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr;
        while ((inputStr = br.readLine()) != null) {
            inputStr = inputStr.trim();
            if (inputStr.isEmpty()) continue;  // 빈 줄이 들어오면 건너뜀

            String[] inputStrs = inputStr.split(" ");
            if (inputStrs.length < 2) continue; // 두 개 이상의 숫자가 없으면 건너뜀

            int a = Integer.parseInt(inputStrs[0]);
            int b = Integer.parseInt(inputStrs[1]);
            bw.write(String.valueOf(a + b));
            bw.newLine(); // 줄바꿈 추가
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // EOF 는 Ctrl + D 이다.

    public static void test() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputsStr = br.readLine().split(" ");
        System.out.println("Array Content : ");
        for ( String str : inputsStr){
            System.out.print(str +" | ");
        }
        System.out.println();
        System.out.println("Array Length : " + inputsStr.length);
        
        int[] inputsParsed = new int[inputsStr.length];
        try {
            for(int i = 0; i<inputsStr.length;i++){
                inputsParsed[i] = Integer.parseInt(inputsStr[i]);
            }
            System.out.print("Parsing Check : Parsed Array Content : ");
            for ( int inputParsed : inputsParsed){
                System.out.print(inputParsed + " | ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Parsing Check : Cannot be parsed to integer");
        }
    }

    // 연속된 공백은 split(" ") 로 무시되지 않음 "   3   " 에 대한 길이 4, 내용 [,,,3]
    //" c c 3 c" 이렇게 읽인 것일 꺼임
    // 틀렸음 1. split(" ") 은 뒤의 공백을 지움
    // 2.공백이 두개이상 붙어버리면 스플릿이 의도대로 되지 않음
    // 3 3 3 -> 4, 3 3 3  3 -> 5, 3 3 3   3 -> 6 : 공백이 연속되면 공백 하나만 건너뛰고 나머지 공백을 카운팅함
    // 3."" 은 split() 해도 변하지않음, 공백값을 가짐. " " 는 split() 하면 사라짐,
}
