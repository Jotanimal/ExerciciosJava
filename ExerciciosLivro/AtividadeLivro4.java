import java.util.Scanner;

public class AtividadeLivro4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Double num1, num2, num3, media;

        System.out.println("Para calcular a média, digite a primeira nota: ");
        num1 = scanner.nextDouble();

        System.out.println("Agora, digite a segunda nota: ");
        num2 = scanner.nextDouble();

        System.out.println("Por fim, digite a terceira nota: ");
        num3 = scanner.nextDouble();

        media = (num1 + num2 + num3) / 3;

        System.out.println("Sua média é " + media);

        scanner.close();
    }
}
