package app; 

public class Compromisso extends Atividade {
    private String datainicial;
    private String datafinal;

    public String getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(String datainicial) {
        this.datainicial = datainicial;
    }

    
    public String getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(String datafinal) {
        this.datafinal = datafinal;
    }

    public Compromisso(
        long id, 
        String descricao,
        String datainicial, 
        String datafinal) {

        this.setId(id);
        this.setDescricao(descricao);
        this.setDatainicial(datainicial);
        this.setDatafinal(datafinal);
    }

    public Compromisso(
        long id, 
        String descricao,
        String datainicial, 
        String datafinal) {

        this.setId(id);
        this.setDescricao(descricao);
        this.setDatainicial(datainicial);
    }
}    