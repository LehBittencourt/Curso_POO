// Aula 1 - Exemplo de Classe e Objeto:

package aula1.poo;

import model.Caneta;

public class Aula1POO {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo  = "bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
