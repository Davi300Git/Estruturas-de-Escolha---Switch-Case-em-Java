import java.util.Scanner;

public class SwitchCaseExercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("===== MENU DE EXERCICIOS =====");
            System.out.println("1 - Cargos e aumento de salario");
            System.out.println("2 - Rodizio veicular SP");
            System.out.println("3 - Calculadora");
            System.out.println("4 - Mês correspondente");
            System.out.println("5 - Destino de passagem");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    exercicio1(sc);
                    break;
                case 2:
                    exercicio2(sc);
                    break;
                case 3:
                    exercicio3(sc);
                    break;
                case 4:
                    exercicio4(sc);
                    break;
                case 5:
                    exercicio5(sc);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opçao invalida!");
            }

            System.out.println();
        } while (opcao != 0);

        sc.close();
    }

    // 1️⃣ Cargos e aumento de salário
    public static void exercicio1(Scanner sc) {
        System.out.println("Codigos: 1-Gerente | 2-Engenheiro | 3-Tecnico | 4-Assistente");
        System.out.print("Digite o codigo do cargo: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o salario atual: R$ ");
        double salario = sc.nextDouble();

        double aumento = 0;
        String cargo = "";

        switch (codigo) {
            case 1:
                cargo = "Gerente";
                aumento = salario * 0.10;
                break;
            case 2:
                cargo = "Engenheiro";
                aumento = salario * 0.08;
                break;
            case 3:
                cargo = "Tecnico";
                aumento = salario * 0.05;
                break;
            case 4:
                cargo = "Assistente";
                aumento = salario * 0.03;
                break;
            default:
                System.out.println("Codigo invalido!");
                return;
        }

        System.out.printf("Cargo: %s%nAumento: R$ %.2f%nNovo salario: R$ %.2f%n",
                cargo, aumento, salario + aumento);
    }

    // 2️⃣ Rodízio veicular SP
    public static void exercicio2(Scanner sc) {
        System.out.print("Digite os quatro ultimos digitos da placa: ");
        int placa = sc.nextInt();
        int digitoFinal = placa % 10;

        String dia = switch (digitoFinal) {
            case 1, 2 -> "Segunda-feira";
            case 3, 4 -> "Terça-feira";
            case 5, 6 -> "Quarta-feira";
            case 7, 8 -> "Quinta-feira";
            case 9, 0 -> "Sexta-feira";
            default -> "Dígito inválido!";
        };

        System.out.println("Nao pode circular na: " + dia);
    }

    // 3️⃣ Calculadora simples
    public static void exercicio3(Scanner sc) {
        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite a operacao (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado;

        switch (op) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: divisao por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operacao inválida!");
                return;
        }

        System.out.printf("Resultado: %.2f%n", resultado);
    }

    // 4️⃣ Mês correspondente
    public static void exercicio4(Scanner sc) {
        System.out.print("Digite um numero de 1 a 12: ");
        int mes = sc.nextInt();

        String nomeMes = switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> "Nao existe mes com esse numero!";
        };

        System.out.println("Mes: " + nomeMes);
    }

    // 5️⃣ Destino de passagem
    public static void exercicio5(Scanner sc) {
        System.out.println("Destinos disponiveis:");
        System.out.println("1 - Rio de Janeiro");
        System.out.println("2 - Bahia");
        System.out.println("3 - Mato Grosso do Sul");
        System.out.print("Escolha o destino (1-3): ");
        int destino = sc.nextInt();

        System.out.print("A viagem é ida e volta? (S/N): ");
        char retorno = sc.next().toUpperCase().charAt(0);

        double preco = switch (destino) {
            case 1 -> 200;
            case 2 -> 350;
            case 3 -> 400;
            default -> 0;
        };

        if (preco == 0) {
            System.out.println("Destino invalido!");
            return;
        }

        if (retorno == 'S') {
            preco *= 2;
        }

        System.out.printf("Valor total da passagem: R$ %.2f%n", preco);
    }
}
