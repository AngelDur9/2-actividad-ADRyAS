
import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        
        int base, altura, area;
        
        
        Scanner a = new Scanner(System.in);

        System.out.println("Dame el valor de la base: ");
            base=a.nextInt();
        System.out.println("Dame el valor de la altura: ");
            altura=a.nextInt();
        area=(base*altura)/2;
        System.out.println("El area del triangulo es: "+ area);
    }
}