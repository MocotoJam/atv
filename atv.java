//simular uma pequena conversa do computador com o usuário
import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        System.out.println("Olá sou o n°1, como é seu nome?");
        try (Scanner scan = new Scanner(System.in)) {
            String resp = scan.nextLine();
            System.out.println("Bem-vindo ao clube " + resp);
        }
    }    
}
