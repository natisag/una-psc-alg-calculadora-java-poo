import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("---CALCULADORA---");

        System.out.print("Digite o primeiro número: ");
        calculadora.setNumeroUm(scanner.nextDouble());

        System.out.print("Digite o segundo número: ");
        calculadora.setNumeroDois(scanner.nextDouble());

        scanner.nextLine();

        while (true) {
            System.out.println("Digite o sinal da operação.\n(+, -, *, /, ^, V)\nCaso deseje sair aperte 'Q'.");
            String sinal = scanner.nextLine();
            System.out.println("--------------------------------");

            switch (sinal) {
                case "+":
                    double resultadoSoma = calculadora.somar();
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    System.out.println("--------------------------------");
                    break;

                case "-":
                    double resultadoSubtracao = calculadora.subtrair();
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    System.out.println("--------------------------------");
                    break;

                case "*":
                    double resultadoMultiplicacao = calculadora.multiplicar();
                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
                    System.out.println("--------------------------------");
                    break;

                case "/":
                    if (calculadora.getNumeroDois() == 0) {
                        System.out.println("Impossível realizar uma divisão por zero.");
                        System.out.println("--------------------------------");
                    } else {
                        double resultadoDivisao = calculadora.dividir();
                        System.out.println("Resultado da divisão: " + resultadoDivisao);
                        System.out.println("--------------------------------");
                    }
                    break;

                case "^":
                    double resultadoPotencia = calculadora.potencia();
                    System.out.println("Resultado da potência: " + resultadoPotencia);
                    System.out.println("--------------------------------");
                    break;

                case "V":
                    if (calculadora.getNumeroUm() < 0 && calculadora.getNumeroDois() % 2 == 0) {
                        System.out.println("Não é possível calcular a raiz de um número negativo com expoente par.");
                        System.out.println("--------------------------------");
                    } else {
                        double resultadoRaiz = calculadora.raiz();
                        System.out.println("O resultado da raiz é: " + resultadoRaiz);
                        System.out.println("--------------------------------");
                    }
                    break;

                case "Q":
                    System.out.println("Você saiu do programa.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Comando inválido.");
                    break;
            }
        }
    }
}