import java.util.Scanner;

public class SalarioSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? R$ ");
        double valorHora = sc.nextDouble();

        System.out.print("Quantas horas trabalhou no mês? ");
        double horas = sc.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double ir = salarioBruto * 0.11;
        double salarioLiquido = salarioBruto - (inss + sindicato + ir);

        System.out.println("\nSalário Bruto: R$ " + salarioBruto);
        System.out.println("Desconto INSS (8%): R$ " + inss);
        System.out.println("Desconto Sindicato (5%): R$ " + sindicato);
        System.out.println("Desconto IR (11%): R$ " + ir);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        sc.close();
    }
}
