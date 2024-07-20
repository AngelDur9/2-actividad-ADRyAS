
import java.util.Scanner;

public class IndiceCorporal {
    public static void main(String[] args) {
        
        double peso, altura, masacorporal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame tu peso en Kilogramos: ");
        peso=teclado.nextDouble();
        System.out.println("Dame tu altura en metros: ");
        altura=teclado.nextDouble();

        masacorporal=peso/(altura*altura);

        System.out.println("Tu indice de masa corporal es: "+ masacorporal);
    }
}
