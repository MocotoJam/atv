//Escreva um programa que leia três números e os imprima na ordem inversa da que foram digitados.
import java.util.Scanner;
public class atividade {

  public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Insira o primeiro número: ");
            int x = in.nextInt();
            System.out.print("Insira o segundo número: ");
            int y = in.nextInt();
            System.out.print("Insira o terceiro número: ");
            int z = in.nextInt();
            
            //imprimindo os numeros na ordem inversa
            System.out.print("3°: "+z+"\n2°: "+y+"\n1°: "+x);

            
        }
    }
}