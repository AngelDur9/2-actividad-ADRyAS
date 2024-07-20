import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
    
        Scanner dato = new Scanner(System.in);

        int Dato1, Dato2, Dato3, Promedio;

        System.out.println("Dame el primer valor: ");
        Dato1=dato.nextInt();

        System.out.println("Dame el segundo dato: ");
        Dato2=dato.nextInt();

        System.out.println("Dame el tercer dato: ");
        Dato3=dato.nextInt();

        Promedio=(Dato1+Dato2+Dato3)/3;

        System.out.println("El promedio de los tres numeros es: " + Promedio);
    }
}
