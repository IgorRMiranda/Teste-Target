import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Numero3 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            FileReader reader = new FileReader("dados.json");
            JSONArray jsonArray = (JSONArray) parser.parse(reader);
            
            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;

            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                double valor = (double) jsonObject.get("valor");

                if (valor > 0) {
                    soma += valor;
                    diasComFaturamento++;

                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                }
            }

            double media = soma / diasComFaturamento;
            int diasAcimaMedia = 0;

            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                double valor = (double) jsonObject.get("valor");

                if (valor > 0 && valor > media) {
                    diasAcimaMedia++;
                }
            }

            System.out.printf("Menor valor de faturamento: %.2f\n", menorValor);
            System.out.printf("Maior valor de faturamento: %.2f\n", maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
