import java.util.Scanner;

public class AtividadeLivro3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double num1, num2, num3, num4, soma;

        System.out.println("Para realizar a soma, digite o primeiro número real: ");
        num1 = scanner.nextDouble();

        System.out.println("Agora, digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextDouble();

        System.out.println("Por fim, digite o último número: ");
        num4 = scanner.nextDouble();

        soma = num1 + num2 + num3 + num4;

        System.out.println("A soma total dos números é de " + soma);

        scanner.close();
    }
}
