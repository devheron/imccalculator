package firstjava;
import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.print("Digite o peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso está normal.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
        
        scanner.close();
    }
}