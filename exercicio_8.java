import java.util.Locale;
import java.util.Scanner;

public class exercicio_8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario;
        double imposto_8;
        double imposto_18;
        double imposto_28;

        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        /*
         * 2000 insentos
         * imposto 8% 1000
         * imposto 18% 1500
         * imposto 28% qlqr vlr acima de 4500
         */
        if (salario <= 0 && salario <= 2000) {
            System.out.println("Isento de imposto de renda");
        } else if (salario >= 2000.01 && salario <= 3000) {
            salario -= 2000;
            imposto_8 = salario * 0.08;
            System.out.printf("R$%.2f", imposto_8);
        } else if (salario >= 3000.01 && salario <= 4500) {
            salario -= 3000;
            imposto_8 = 1000 * 0.08;
            imposto_18 = salario * 0.18;
            System.out.printf("R$%.2f", (imposto_8 + imposto_18));
        } else if (salario > 4500) {
            salario -= 4500;
            imposto_8 = 1000 * 0.08;
            imposto_18 = 1500 * 0.18;
            imposto_28 = salario * 0.28;
            System.out.printf("R$%.2f", (imposto_8 + imposto_18 + imposto_28));
        } else {
            System.out.println("Digite um salário valido");
        }
        sc.close();
    }
}