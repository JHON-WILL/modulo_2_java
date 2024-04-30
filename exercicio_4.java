import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora1;
        int hora2;

        System.out.println("Digite a hora inicial e a hora final, desconciderando os minutos: ");
        hora1 = sc.nextInt();
        hora2 = sc.nextInt();

        if (hora1 >= hora2) {
            System.out.printf("O jogo durou %d horas", (24 - hora1 + hora2));
        } else {
            System.out.printf("O jogo durou %d horas", (hora2 - hora1));
        }
        sc.close();
    }
}