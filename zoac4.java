import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zoac4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        double h = Integer.parseInt(input[0]);
        double w = Integer.parseInt(input[1]);
        double n = Integer.parseInt(input[2]);
        double m = Integer.parseInt(input[3]);

        int x = (int) Math.ceil(h / (n + 1));
        int y = (int) Math.ceil(w / (m + 1));

        System.out.println(x * y);
    }
}
