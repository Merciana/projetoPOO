package Model;

public class Pessoa {
    private String nome;
    private int iddentifacacao;
    private String contato;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIddentifacacao() {
        return iddentifacacao;
    }

    public void setIddentifacacao(int iddentifacacao) {
        this.iddentifacacao = iddentifacacao;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
