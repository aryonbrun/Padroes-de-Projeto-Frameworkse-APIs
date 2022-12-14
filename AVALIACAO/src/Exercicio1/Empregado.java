package Exercicio1;

import java.time.LocalDate;

public abstract class Empregado extends EmpregadoFactory {
    private String nome;
    private String email;
    private int anoContratacao;

    public abstract float calculaSalario();

    public abstract float ganha();

    public int tempoCasa(){ //criando um metodo
        LocalDate data_local = LocalDate.now();
        int anoAtual = data_local.getYear();
        return anoAtual - this.anoContratacao;
    }

    public Empregado(String nome, String email, int anoContratacao) {
        this.nome = nome;
        this.email = email;
        this.anoContratacao = anoContratacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(int anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", anoContratacao=" + anoContratacao +
                '}';
    }
}
