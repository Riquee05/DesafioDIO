import java.util.Scanner;


public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        
        boolean continuar = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            exibirMenu();

        int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                // Adiciionar Valor no Saldo
                System.out.println("Qual Valor Gostaria de depositar? " );
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                break;

                //Saca o Valor do Saldo
                case 2:
                System.out.println("Qual valor gostaria de Sacar? ");
                double valorSaque = scanner.nextDouble();
                
                //Caso não haja valor suficiente a ser sacado
                if (valorSaque > saldo){
                System.out.println(" Saldo Insuficiente");
            } else saldo -= valorSaque;
                break;

                //Saldo Atual
                case 3:
                System.out.println("Saldo Atual: " + saldo);
                break;
             
                //Para encerrar o Programa
                case 4:
                System.out.println("Encerrando o Programa...");
                scanner.close();
                return;

                
            
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); }
            }
        }

        public static void exibirMenu() {
            System.out.println("---MENU---");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Encerrar o Programa");
            System.out.println("Escolha uma opção");

        }
    }
