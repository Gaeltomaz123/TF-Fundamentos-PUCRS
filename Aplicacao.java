import java.util.Scanner;
public class Aplicacao {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int escolhaMenu=0;
        CadastroPacientes Cadastro = new CadastroPacientes();
        System.out.println("\f");
        //Loop de escolha do menu, quando é digitado 8 ele encerra
        while(escolhaMenu != 8) {
            System.out.println("\n[1] ........ Cadastrar paciente");
            System.out.println("[2] ........ Remover paciente");
            System.out.println("[3] ........ Mostrar as 10 posições do vetor");
            System.out.println("[4] ........ Mostrar somente os pacientes cadastrados");
            System.out.println("[5] ........ Nome de todos pacientes em ordem alfabética crescente");
            System.out.println("[6] ........ Porcentagem de pacientes com as doenças");
            System.out.println("[7] ........ Relatório do estoque dos medicamentos");
            System.out.println("[8] ....... Sair");
            System.out.print("\nEscolha: ");
            escolhaMenu = teclado.nextInt();
            System.out.println("\f");
            //Switch case que possui todas as opções e executa o método a partir da escolha do usuário
            switch(escolhaMenu){
                case 1: {
                    Cadastro.adicionarPaciente();
                    break;
                }
                case 2: {
                    Cadastro.removerVetor();
                    break;
                }
                case 3: {
                    Cadastro.todoVetor();
                    break;
                }
                case 4: {
                    Cadastro.pacientesCadastrados();
                    break;
                }
                case 5: {
                    Cadastro.nomePacientes();
                    break;
                }
                case 6: {
                    Cadastro.porcentagemDoenças();
                    break;
                }
                case 7: {
                    Cadastro.relatorio();
                    break;
                }
            }
            //Usuário recebe opção inválida caso o número digitado não esteja entre 1 e 8
            if(escolhaMenu < 1 || escolhaMenu > 8){
                System.out.println("Opção Inválida");
            }
        }
    }
}