import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Qual valor atual da passagem para Alemanha? ");
     int valor1 = scanner.nextInt();
     
     System.out.println("Qual valor atual da passagem para Portugal? ");
     int valor2 = scanner.nextInt();
     
     System.out.println("Qual valor atual da passagem para Itália? ");
     int valor3 = scanner.nextInt();
     
     System.out.println("Quantas pessoas participarão dessa viagem? ");
     int pessoas = scanner.nextInt();
     
     int total = (valor1 + valor2 + valor3) * pessoas;
     System.out.println("O valor total de uma viagem eurotrip para " + pessoas + " pessoas é de R$" + total + ",00.");
  }
}