//Escreva um programa que pergunte o nome e a idade de um indivíduo e imprima (aproximadamente) 
//quantos dias de vida ele possui.
import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        
        System.out.println("Olá sou o n°1, como é seu nome?");
        try (Scanner scan = new Scanner(System.in)) {
            String resp = scan.nextLine();
            System.out.println("Bem-vindo ao clube " + resp);
        }
    }
}