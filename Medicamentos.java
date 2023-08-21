public class Medicamentos {
    private String nomeRemedio;
    private int qntdCaixas;

    //Método Construtor
    public Medicamentos(String nomeRemedio, int qntdCaixas){
        this.nomeRemedio = nomeRemedio;
        this.qntdCaixas = qntdCaixas;
    }
    
    //Getters
    public String getNomeRemedio(){return nomeRemedio;}
    public int getQntdCaixas(){return qntdCaixas;}

    //Setters
    public void setQntdCaixas(int novaQntndCaixa){qntdCaixas=novaQntndCaixa;}
    public void setNomeRemedio(String novoNomeRemedio){nomeRemedio=novoNomeRemedio;}

    //Método to Sting
    public String toString(){
        return "Medicamento: " + nomeRemedio + " - " + "Quantidade Disponivel: " + qntdCaixas; 
    }
}
