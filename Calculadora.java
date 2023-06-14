import java.util.Scanner;

public class Calculadora {
    /**
     * @param args
     */
    /**
     * @param args
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        
        int operacao = scanner.nextInt();
        
        double resultado = 0;
        
        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }
        
        System.out.println("O resultado da operação é: " + resultado);
        
        scanner.close();
    }

    @Override
    public String toString() {
        return "Calculadora []";
    }
}