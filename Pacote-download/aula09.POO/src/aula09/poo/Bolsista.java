package aula09.poo;

public class Bolsista extends Aluno {
    
    // Atributos
    private float bolsa;
    
    // Métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " e bolsista! Pagamento facilitado");
    }
    
    // Métodos Especiais
    public float getBolsa(){
        return bolsa;
    }
    
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
}
