import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Escreva o primeiro número: ");
     int numero1 = scanner.nextInt();
     
     System.out.println("Escreva o segundo número: ");
     int numero2 = scanner.nextInt();
     
     int soma = numero1 + numero2;
     System.out.println("O resultado da soma de " + numero1 + " + " + numero2 + " é igual a " + soma);
     
     int subtracao = numero1 - numero2;
     System.out.println("O resultado da subtração de " + numero1 + " - " + numero2 + " é igual a " + subtracao);
     
     int multiplicacao = numero1 * numero2;
     System.out.println("O resultado da multiplicação de " + numero1 + " * " + numero2 + " é igual a " + multiplicacao);
  }
}