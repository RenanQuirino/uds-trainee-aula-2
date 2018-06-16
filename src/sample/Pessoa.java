package sample;

public class Pessoa {
    private String nome = null;
    private String cep =  null;
    private String endereço = null;
    private Integer numero = null;
    private String complemento = null;
    private String bairro = null;
    private String cidade = null;
    private String estado = null;

    public void setNome (String nome){
        this.nome= nome;
    }
    public void setCep (String cep) {
        this.cep= cep;
    }

    public String obterInformacoes(){
        return "Nome: " + this.nome + "  Cep:" + this.cep;
    }
}
