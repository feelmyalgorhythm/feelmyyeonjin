import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleAndThreeSides {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if (a == 0 && b == 0 && c == 0) break;

            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a >= b + c || b >= a + c || c >= a + b) {
                System.out.println("Invalid");
            } else if (a == b || b == c || c == a) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}
