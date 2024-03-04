package aula10.poo;

public class Peixe extends Animal{
    
    // Atributos
    private String corEScama;
    
    // Métodos
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo substancias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe não faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }
    
    // Métodos Especiais
    public String getCorEScama() {
        return corEScama;
    }

    public void setCorEScama(String corEScama) {
        this.corEScama = corEScama;
    }
    
    
}
