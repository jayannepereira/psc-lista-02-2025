import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Qual valor do litro de gasolina? ");
     int valor = scanner.nextInt();
     
     System.out.println("Quantos litros foram vendidos? ");
     int qntdd = scanner.nextInt();
     
     int total = valor * qntdd;
     System.out.println("O valor total a pagar é de R$" + total + ",00.");
  }
}