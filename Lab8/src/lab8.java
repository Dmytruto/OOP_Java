import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class lab8 {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder newStr = new StringBuilder();
        byte[] asciiBytes = str.getBytes(StandardCharsets.US_ASCII);
        for (byte x: asciiBytes) {
            if(x != 32) {
                int currenCharASCII = x < 91 ? x%64 : x%96;
                newStr.append(currenCharASCII > 9 ? currenCharASCII + " " : currenCharASCII + "  ");
            }
        }

        System.out.println(newStr);
    }
}
