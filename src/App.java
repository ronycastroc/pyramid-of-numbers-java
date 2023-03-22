import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            String result = "";
            
            for (int j = 1; j <= i; j++) {
                result += i;
            }

            System.out.println(result);
        }

        scanner.close();
    }
}
