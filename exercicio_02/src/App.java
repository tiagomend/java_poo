import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Nome: ");
        employee.name = sc.nextLine();
        System.out.print("Salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println(employee);

        System.out.println();
        System.out.print("Aumentar o salário em quantos porcento? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        
        System.out.println();
        System.out.println(employee);

        sc.close();
    }
}
