import java.util.Scanner;

public class exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro maior ou menos que zero: ");
        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.printf("O número %d é positivo", numero);
        } else {
            System.out.printf("O número %d é negativo", numero);
        }
        sc.close();
    }

}