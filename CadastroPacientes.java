import java.util.*;
import java.util.Scanner;
public class CadastroPacientes {
   private Paciente [] cadastro;
   private Medicamentos [] v;
   private int numpaciente;
   private int proxLivre;
   
   //Método construtor
    public CadastroPacientes(){
        cadastro = new Paciente[10];
        numpaciente = 1;
        proxLivre = 0;
        v = new Medicamentos[4];
        v[0] = new Medicamentos("CovixUltra", 10);
        v[1] = new Medicamentos("Zikox", 10);
        v[2] = new Medicamentos("ChikTop", 10);
        v[3] = new Medicamentos("Denguenit", 10);
   }
   
   //Método de "adicionar Paciente", basicamente coleta os inputs do usuário e manda para o método adicionarVetor
   public void adicionarPaciente(){
       //Primeiro checar se o próximo paciente vai ser menor que 10, isso por que a variável proxLivre começa em 0, portanto contando com o 0 o último número que proxLivre pode assumir é 9
       if(proxLivre < 10){
           //Inputs
           Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o nome do Paciente: ");
            String n = teclado.next();
            //Verificação se o nome possui apenas letras / obs: repete caso de false
            boolean eLetranome = (n != null && n.matches("[a-zA-Z]*"));
            while(eLetranome == false){
                System.out.println("Nome inválido!!!");
                System.out.println("Digite apenas letras.");
                System.out.println("Digite o nome do Paciente: ");
                n = teclado.next();
                eLetranome = (n != null && n.matches("[a-zA-Z]*"));
            }
            String nome = n.substring(0,1).toUpperCase() + n.substring(1);
            System.out.println("Digite o cpf do Paciente: ");
            String cpf = teclado.next();
            //Verificação se o nome possui apenas numeros com 11 digitos / obs: repete caso de false
            boolean eNumerocpf = (cpf != null && cpf.matches("[0-9]*"));
            while(eNumerocpf == false || cpf.length() != 11){
                System.out.println("Cpf Inválido!!!");
                if(eNumerocpf == false){
                    System.out.println("Digite apenas números.");
                }
                if(eNumerocpf && cpf.length() != 11){
                        System.out.println("O número de dígitos deve ser igual a 11.");
                }
                System.out.println("Cpf do Paciente: ");
                cpf = teclado.next();
                eNumerocpf = (cpf != null && cpf.matches("[0-9]*"));
            }
            System.out.println("Digite o telefone do Paciente: ");
            String telefone = teclado.next();
            //Verificação se o nome possui apenas numeros com no minimo 9 e no maximo 13 / obs: repete caso de false
            boolean eNumerotelefone = (telefone != null && telefone.matches("[0-9]*"));
            while(eNumerotelefone == false || telefone.length() < 9 || telefone.length() > 13){
                System.out.println("Telefone Inválido!!!");
                if(eNumerotelefone == false){
                    System.out.println("Digite apenas números.");
                }
                if(eNumerotelefone && telefone.length() < 9){
                        System.out.println("O número de dígitos deve ser maior que 8.");
                }
                if(eNumerotelefone && telefone.length() > 13){
                    System.out.println("O número de dígitos deve ser menor que 14.");
                }
                System.out.println("Telefone do Paciente: ");
                telefone = teclado.next();
                eNumerotelefone = (telefone != null && telefone.matches("[0-9]*"));
            }
            System.out.println("Digite o diagnostico do Paciente (1 - Covid, 2 - Zika, 3 - Chikungunya, 4 - Dengue): ");
            int diagnostico = teclado.nextInt();
            //Verificação se o diagnostico esta entre 1 e 4 / obs: repete caso de false
            while(diagnostico < 1 || diagnostico > 4){
                System.out.println("Diagnostico Inválido!!!");
                System.out.println("Por favor digite um valor válido (1 - Covid, 2 - Zika, 3 - Chikungunya, 4 - Dengue): ");
                diagnostico = teclado.nextInt();
            }
            System.out.println("Digite a Quantidade de caixas do medicamento do Paciente: ");
            int qntdcaixa = teclado.nextInt();
            int qntdcaixaestoque = v[diagnostico-1].getQntdCaixas();
            //Lógica para pegar o medicamento indicado
            String medicamentoIndicado = v[diagnostico-1].getNomeRemedio();
            //Verificação se existem caixas disponíveis no estoque / obs: repete caso de false
            while(qntdcaixa > qntdcaixaestoque || qntdcaixa == 0){
                if(qntdcaixa > qntdcaixaestoque){
                    System.out.println("Infelizmente não temos " + qntdcaixa + " caixas disponíveis");
                }
                System.out.println("Por favor digite um valor válido (" + qntdcaixaestoque + " caixa(s) disponíveis): ");
                qntdcaixa = teclado.nextInt();
            }
            //Lógica para diminuir um remédio no estoque de medicamento de acordo com o número digitado
            v[diagnostico-1].setQntdCaixas(qntdcaixaestoque-qntdcaixa);
            adicionarVetor(nome, cpf, telefone, diagnostico, medicamentoIndicado, qntdcaixa);
            System.out.println("Paciente adicionado com sucesso!");
        } else {
            System.out.println("Limite de pacientes atingindo! Por favor, remova um paciente se quiser adicionar outro.");
        }
    }

   //Método que realmente adiciona/cria o Paciente no vetor
   public void adicionarVetor(String nome, String cpf, String telefone, int diagnostico, String medicamentoIndicado, int qntdcaixa){
      Paciente novopaciente = new Paciente(numpaciente, nome, cpf, telefone, diagnostico, medicamentoIndicado, qntdcaixa);
      cadastro[proxLivre] = novopaciente;
      numpaciente ++;
      proxLivre ++;
   }
   
   //Método que "remove" o paciente do vetor
   public void removerVetor(){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Digite o numero do Paciente a ser removido: ");
        int numPaciente = teclado.nextInt();
        //Loop para percorrer todas as posições ocupadas do vetor
        for(int i = 0; i < proxLivre; i++){
            //if para pegar o paciente que o usuario digitou
            if(cadastro[i].getNumPaciente() == numPaciente){
                //Outro loop para percorrer posições depois desse paciente
                for(int k = i; k < proxLivre; k++){
                    //Paciente para ser removido recebe o próximo
                    cadastro[k] = cadastro[k+1];
                    //Se o proximo não for vazio o numero do paciente diminui 1
                    if(cadastro[k] != null){
                        cadastro[k].setNumPaciente(cadastro[k].getNumPaciente()-1);
                    }
                }
                //Diminui 1 de numpaciente e de proxLivre, garantido que não de erro na hora de criar outro paciente depois
                numpaciente--;
                proxLivre--;
            }
        }
   }

   public void todoVetor(){
        System.out.println("Todas as posições do vetor:");
      for (int i=0; i<10; i++){
         if(cadastro[i] == null){
            System.out.println("\nPosicão " + (i+1) + " do Vetor: Sem paciente");
         } else {
            System.out.println("\nPosicão " + (i+1) + " do Vetor:\n" + cadastro[i]);
         }
      }
   }

   public void nomePacientes(){
      String [] nome = new String[proxLivre];
      int i = 0;
      while(i<proxLivre){
          nome[i]= cadastro[i].getNome();
          i++;
      }
      Arrays.sort(nome);
      System.out.println("Nome dos pacientes cadastrados em ordem alfabética crescente:");
      for(int j = 0; j<nome.length; j++){
          for(int f=0; f<nome.length; f++){
                if(cadastro[f].getNome() == nome[j]){
                    System.out.println("Paciente " + cadastro[f].getNumPaciente() + ": " + nome[j]);
                }
            }
      }
      if(i==0 && proxLivre==0){
              System.out.println("No momento não existem pacientes cadatrados no sistema");
      }
  }
  
  public void pacientesCadastrados(){ 
      Paciente[] copia = new Paciente[proxLivre];
      int i = 0;
      System.out.println("Pacientes cadastrados: ");
      while(i<proxLivre){
          copia[i] = cadastro[i];
          System.out.println("\n" + copia[i]);
          i++;
      }
      if(i==0 && proxLivre==0){
              System.out.println("No momento não existem pacientes cadatrados no sistema");
        }
  }

  //Método para saber a porcentagem de pacientes com cada doença
  public void porcentagemDoenças(){
      int covid = 0, zika = 0, chikungunya = 0, dengue = 0;
      System.out.println("Porcentagem das doenças com base nos pacientes:");
      //Loop para passar por todo o vetor
      for(int i=0; i<proxLivre; i++){
         int doença = cadastro[i].getDiagnostico();
         //Switch para aumentar o valor cada doença de acordo cada paciente no vetor
         switch(doença){
            case 1: {
               covid++;
               break;
            }
            case 2: {
               zika++;
               break;
            }
            case 3: {
               chikungunya++;
               break;
            }
            case 4: {
               dengue++;
               break;
            }
         }
      }
      //Aqui faço a checagem se é 0 pois se for, não pode fazer parte do cálculo de porcentagem pois daria erro
      if(covid==0){
         System.out.println("Covid: 0%");
      } else {
          //Cálculo da porcentagem
         System.out.println("Covid: " + (100/((double)proxLivre/covid)) + "%");
      }
      if(zika==0){
         System.out.println("Zika: 0%");
      } else {
         System.out.println("Zika: " + (100/((double)proxLivre/zika)) + "%");
      }
      if(chikungunya == 0){
         System.out.println("Chikungunya: 0%");
      } else {
         System.out.println("Chikungunya: " + (100/((double)proxLivre/chikungunya)) + "%");
      }
      if(dengue== 0){
         System.out.println("Dengue: 0%");
      } else {
         System.out.println("Dengue: " + (100/((double)proxLivre/dengue)) + "%");
      }
  }
  
  //Método para exibir o vetor dos medicamentos
  public void relatorio(){
        System.out.println("Relatório do estoque de medicamentos:");
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
    }
}