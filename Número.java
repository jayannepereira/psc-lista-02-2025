import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Escreva um número aleatório: ");
     int numero = scanner.nextInt();
     
     System.out.println("O número informado foi " + numero + ".");
  }
}