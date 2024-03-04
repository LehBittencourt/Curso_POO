package aula3.poo;

public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
            
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = true;
    }
    public Caneta(String m, String c, float p){ // Método Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
}
