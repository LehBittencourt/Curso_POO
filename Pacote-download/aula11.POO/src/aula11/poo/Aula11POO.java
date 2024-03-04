// Aula 11 - Polimorfismo de Sobrecarga

package aula11.poo;

public class Aula11POO {

    public static void main(String[] args) {
     
    // Animal x = new Animal(); - ERRO!
    
    Mamifero m = new Mamifero();
    Cachorro c = new Cachorro();
    
    m.emitirSom();
    c.emitirSom();
    
    
    c.reagir("Ola");
    c.reagir("Vai apanhar");
    
    c.reagir(11, 45);
    c.reagir(21, 00);
    
    c.reagir(true);
    c.reagir(false);
    
    c.reagir(2, 12.5f);
    c.reagir(17, 4.5f);
    
    }
    
}
