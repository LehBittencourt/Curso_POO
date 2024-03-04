// Aula 4 - Exemplo Prático com Objetos:

package aula4.poo;

import model.ContaBanco;

public class Aula4POO {

    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco(1111, "CC", "Mario", 0.0f);
        ContaBanco p2 = new ContaBanco(2222, "CP", "Maria", 0.0f);
        
        p1.abrirConta("CC");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        p1.sacar(150);
        p2.sacar(1000);
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
