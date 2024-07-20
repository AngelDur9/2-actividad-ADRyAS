import java.util.Scanner;
public class salario {
    public static void main(String[] args) {
        double salario, P_impuesto, deducciones, impuestos, salario_N;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame tu salario completo: ");
        salario=teclado.nextDouble();

        System.out.println("Dame que porcentaje es de impuestos: ");
        P_impuesto=teclado.nextDouble();

        System.out.println("Escribe cuanto es de deduccuiones adicionales: ");
        deducciones=teclado.nextDouble();

        impuestos=salario*(P_impuesto/100);

        salario_N=salario-impuestos-deducciones;

        System.out.println("Tu salario neto es de: "+ salario_N);
    }
}
