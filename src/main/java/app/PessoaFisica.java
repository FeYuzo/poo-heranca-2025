package app;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome,String endereco, LocalDate dataNascimento, String cpf){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacao() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nome :"+this.getNome+ 
        "Endereço: "+this.getEndereco+
        "Data Nascimento: "+this.getDataNascimento+
        "CPF: "+this.getCpf+);
    }
    
}