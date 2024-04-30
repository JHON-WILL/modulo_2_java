import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) { // variaveis
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo;
        int qtd;
        double hot_dog = 4.0;
        double x_salada = 4.5;
        double x_bacon = 5.0;
        double torrada = 2.0;
        double refri = 1.5;

        do {// verificar se o pedidio é valido
            System.out.println("Digite o codigo do produto e a quantidade, respectivamente: ");
            codigo = sc.nextInt();
            qtd = sc.nextInt();
        } while (codigo > 5 && codigo <= 0);

        if (codigo == 1) { // saida de dados
            System.out.printf("Pedido: Cachorro quente Total:R$ %.2f", (hot_dog * qtd));
        } else if (codigo == 2) {
            System.out.printf("Pedido: X-Salada Total: R$%.2f", (x_salada * qtd));
        } else if (codigo == 3) {
            System.out.printf("Pedido: X-Bacon Total: R$%.2f", (x_bacon * qtd));
        } else if (codigo == 4) {
            System.out.printf("Pedido: Torrada Simples Total: R$%.2f", (torrada * qtd));
        } else if (codigo == 5) {
            System.out.printf("Pedido: Refrigerante Total: R$%.2f", (refri * qtd));
        }
        sc.close();
    }
}