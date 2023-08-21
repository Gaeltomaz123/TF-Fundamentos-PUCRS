public class Paciente {
    private int numPaciente;
    private String nome;
    private String cpf;
    private String telefone;
    private int diagnostico;
    private String medicamentoIndicado;
    private int qntdcaixa;

    //Método Construtor
    public Paciente(int numPaciente, String nome, String cpf, String telefone, int diagnostico, String medicamentoIndicado, int qntdcaixa){
        this.numPaciente = numPaciente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.diagnostico = diagnostico;
        this.medicamentoIndicado = medicamentoIndicado;
        this.qntdcaixa = qntdcaixa;
    }

    //Getters
    public int getNumPaciente(){return numPaciente;}
    public String getNome(){return nome;}
    public String getCpf(){return cpf;}
    public String getTelefone(){return telefone;}
    public int getDiagnostico(){return diagnostico;}
    public String getMedicamentoIndicado(){return medicamentoIndicado;}
    public int getQntdCaixa(){return qntdcaixa;}

    //Setters
    public void setNumPaciente(int novoNumPaciente){numPaciente=novoNumPaciente;}
    public void setNome(String novoNome){nome=novoNome;}
    public void setCpf(String novoCpf){cpf=novoCpf;}
    public void setTelefone(String novoTelefone){telefone=novoTelefone;}
    public void setDiagnostico(int novoDiagnostico){diagnostico=novoDiagnostico;}
    public void setMedicamentoIndicado(String novoMedicamentoIndicado){medicamentoIndicado=novoMedicamentoIndicado;}
    public void setQntdCaixa(int novaQntndCaixa){qntdcaixa=novaQntndCaixa;}

    //método toString
    public String toString(){
        return "Paciente: " + numPaciente + "\nNome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone + "\nDiagnostico: " + diagnostico + "\nMedicamento Indicado: " + medicamentoIndicado + "\nQuantidade de Caixas: " + qntdcaixa; 
    }
}