import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

// java.math.BigDecimal = decimais grandes e precisos
// java.math.RoudingMode = ajuda no arredondamento de números quebrados

public class AtividadeLivro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Definindo váriaveis        
        Float num1, num2, calculo;

        System.out.println("Digite um número real: ");
        num1 = scanner.nextFloat();

        System.out.println("Agora, digite outro número real: ");
        num2 = scanner.nextFloat();

        calculo = num1 * num2;

        System.out.println("O resultado da multiplicação é de " + calculo);

        scanner.close();

    }
}
