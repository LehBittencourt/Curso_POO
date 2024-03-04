package model;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(int n, String t, String d, float s){ 
        if (t != null && d != null) { 
            this.numConta = n; 
            this.tipo = t;     
            this.dono = d;     
            this.saldo = 0;   
            this.status = false;
        } else {
            System.out.println("Tipo e Dono não podem ser nulos");
        }
    
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setNumConta(int num){
        this.numConta = num;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStauts(boolean status){
        this.status = status;
    }
    
    
    public void abrirConta(String t){
        this.setTipo(t);     // Pode fazser da mesma maneira
        this.status = true;
        
        if (tipo.equals("CC")){
            this.setSaldo(50);
        } else if (tipo.equals("CP")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta(){
        if(this.getSaldo() == 0 && this.getStatus()){
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else if(this.getSaldo() > 0) {
            System.out.println("ERRO! Não pode fechar conta se ainda tiver saldo!");
        } else if(this.getSaldo() < 0){
            System.out.println("ERRO! Não pode fechar a conta estando com débitos!");
        }
    }
    
    public void depositar(float v){  
        if(this.getStatus()){
            // this.saldo += v; - Pode ser feita das duas maneiras
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float v){ //conferir
        if(this.getStatus()){
                if(this.getSaldo() >= v){
                    saldo -= v;
                    System.out.println("Saque realizado na conta de " + this.getDono());
                } else {
                    System.out.println("ERRO! Saldo insuficiente!");
                }
            
        } else {
            System.out.println("ERRO! Conta não esta aberta!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        
        if (this.getTipo().equals("cc")){
            v = 12;
        } else if (this.getTipo().equals("cp")){
            v = 20;
        } 
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v); 
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
    
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }
    
    
}
    
    