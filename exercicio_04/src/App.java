import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Dados do Produto: " + product);

        System.out.println();    
        System.out.print("Adicione produtos ao estoque: ");
        quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Dados Atualizados: " + product);

        System.out.println();
        System.out.print("Remova produtos do estoque: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Dados Atualizados: " + product);

        sc.close();
    }
}
