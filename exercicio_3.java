import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Digite dois números para verificar se são multiplos");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.printf("Os números %d e %d são multiplos: ", num1, num2);
        } else {
            System.out.printf("Os números %d e %d não são multiplos: ", num1, num2);
        }
        sc.close();
    }

}