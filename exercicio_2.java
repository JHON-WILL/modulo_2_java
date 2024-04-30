import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro para verificar se é par: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é par", numero);
        } else {
            System.out.printf("O número %d é impar", numero);
        }

        sc.close();
    }
}