import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x;
        double y;

        System.out.println(
                "Digite dois valores decimais ou inteiros para determinar coordenadas de um plano cartesiano X e Y, lembrando que numeros a direita e para cima são positivos e a esquerda e para baixo são negativos, que o plano cartesiano tem 4 quadrantes Q1, Q2, Q3 e Q4 e que X é a linha horizontal e Y vertical, esse codigo é para definir em que quadrante esta as coordenadas digitadas: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if ((x > 0 && y > 0)) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        }
        sc.close();
    }
}