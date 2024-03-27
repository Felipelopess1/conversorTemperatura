import java.text.DecimalFormat;
import java.util.Scanner;
public class ConversorTemp {
    public static void main(String[] args) throws Exception {
        // Variaveis Celsius e Fahrenheit
        double c,f;
        int opcao;
        // Objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        //Entrada de dados
        System.out.println("Conversão de temperatura");
        do{
            System.out.println("Selecione uma opcao \n 1 - Celsius\n 2 - Fahrenheit");
            opcao = teclado.nextInt();

            if (opcao != 1 && opcao != 2) {
                System.out.println("Opcao invalida. Por favor, escolha 1 ou 2.");
            }
        } while(opcao != 1 && opcao != 2);

        if(opcao == 1){
            System.out.println("Digite a temperatura em Celcius: ");
            c = teclado.nextDouble();
            f = (9 * c / 5) + 32;
            System.out.println("A temperatura em Fahrenheit e: " + formatador.format(f));
        } else{
            System.out.println("Digite a temperatura em Fahrenheit: ");
            f = teclado.nextDouble();
            c = (f - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius e: " + formatador.format(c));
        }
        teclado.close();
    }
    
}
