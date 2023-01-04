import java.util.Locale;
import java.util.Scanner;
import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Entre com a largura e altura do retângulo: ");
        rectangle.height = sc.nextDouble();
        rectangle.width = sc.nextDouble();

        System.out.printf("ÁREA = %.2f%n", rectangle.area());
        System.out.printf("PERÍMETRO = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());

        sc.close();
    }
}
