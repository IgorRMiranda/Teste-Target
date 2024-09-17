import java.util.Scanner;

public class Numero2 {

    public class Fibonacci {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            scanner.close();

            int a = 0, b = 1;
            boolean pertence = false;

            if (num == 0 || num == 1) {
                pertence = true;
            } else {
                while (b <= num) {
                    int temp = b;
                    b = a + b;
                    a = temp;

                    if (b == num) {
                        pertence = true;
                        break;
                    }
                }
            }

            if (pertence) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
            }
        }
    }

}
