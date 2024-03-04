package aula09.poo;

public abstract class Pessoa {
    
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    
    // Métodos
    public void fazerAniversario(){
        this.idade++;
    }
    
    // Métodos Especiais
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + '}';
    }
    
    
}

/*
Pessoa p1 = new Pessoa(); -> isso na main da erro, pois
voce não pode criar um objeto de uma classe abstrata
*/