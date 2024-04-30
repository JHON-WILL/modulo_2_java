import java.util.Locale;
import java.util.Scanner;

public class exercicio_6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor;
        // entrada de dados
        System.out.println("Digite um valor acima de 0 e abaixo de 100: ");
        valor = sc.nextDouble();
        // codigo
        if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo [75,100]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo [50,75]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else {
            System.out.println("Valor fora de intervalo");
        }
        sc.close();
    }
}