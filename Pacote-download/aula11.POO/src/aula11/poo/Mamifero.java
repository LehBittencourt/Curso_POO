package aula11.poo;

public class Mamifero extends Animal {
    
    // Atributos 
    protected String corPelo;
    
    // Métodos
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }

    // Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
