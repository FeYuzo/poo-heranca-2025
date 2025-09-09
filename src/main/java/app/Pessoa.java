package app;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;

    public Pessoa(String nome, String endereco) {
        this.setNome(nome);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
   
    public String getEndereco() {
        return endereco;    
    }   
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
    public abstract String exibirInformacao();
}