//Escreva um programa que pergunte qual o raio de um círculo e imprima a sua área.
import java.util.Scanner;

public class atv5 {
    public static void main(String args[]) {

        //iniciar variaveis
        int r;
        double pi = 3.14, area;
        //entrada de dados
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Insira o raio: ");
            r = scan.nextInt();
        }
        area = pi * r * r;// calculo das variaveis
        System.out.println("A área do seu círculo: " + area);
    }
}
