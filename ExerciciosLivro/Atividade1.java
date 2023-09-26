// importa a biblioteca de Scan que permite que o usuário faça inputs na aplicação
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Agora, digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        String nomeSobrenome = sobrenome + ", " + nome;

        System.out.println(nomeSobrenome + "... Seja bem vindo!");

        //fecha o scan
        scanner.close();
    }
}
