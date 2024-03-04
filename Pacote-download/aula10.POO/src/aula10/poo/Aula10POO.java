// Aula 10 - Polimorfismo de Sobreposição

package aula10.poo;

public class Aula10POO {

    public static void main(String[] args) {
        
        // Animal n = new Animal(); - Erro! 
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguro c = new Canguro();
        Cachorro k = new Cachorro();
        
        c.locomover();
        k.locomover();
        
        c.emitirSom();
        k.emitirSom();
        
    }
    
}
