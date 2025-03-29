import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
     Scanner scanner = new Scanner(System.in);
      
     System.out.println("Escreva a primeira nota: ");
     int nota1 = scanner.nextInt();
     
     System.out.println("Escreva a segunda nota: ");
     int nota2 = scanner.nextInt();
     
     System.out.println("Escreva a terceira nota: ");
     int nota3 = scanner.nextInt();
     
     System.out.println("Escreva a quarta nota: ");
     int nota4 = scanner.nextInt();
     
     int media = (nota1 + nota2 + nota3 + nota4) / 4;
     System.out.println("A média das notas bimestrais é de " + media + ".");
  }
}