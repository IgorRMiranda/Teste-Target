import java.util.Scanner;

public class Numero5 {

    public class InverterString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();
            scanner.close();

            char[] caracteres = input.toCharArray();
            int inicio = 0;
            int fim = caracteres.length - 1;

            while (inicio < fim) {
                char temp = caracteres[inicio];
                caracteres[inicio] = caracteres[fim];
                caracteres[fim] = temp;

                inicio++;
                fim--;
            }

            String invertida = new String(caracteres);
            System.out.println("String invertida: " + invertida);
        }
    }

}
