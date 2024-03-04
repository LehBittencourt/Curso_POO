package aula12.poo;

public class Aluno extends Pessoa {
    
    // Atributos
    private String login;
    private int totalAssistido;
    
    // Construtor
    public Aluno(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }
    
    // Métodos Especiais
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() + "\nlogin=" + login + ", totalAssistido=" + totalAssistido + '}';
    }
    
    
}
