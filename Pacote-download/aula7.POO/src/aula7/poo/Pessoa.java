package aula7.poo;

public class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Construtor
    public Pessoa(String n, int i, String s){
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    
    // Métodos
    public void fazerAniver(){
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

}
