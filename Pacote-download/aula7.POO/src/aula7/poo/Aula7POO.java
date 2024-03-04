// Aula 7 - Exercício de POO

package aula7.poo;

public class Aula7POO {

    public static void main(String[] args) {
        
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("Aprendendo sobre a vida", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO", "Fulaninha", 500, p[1]);
        l[2] = new Livro("Vira Roleta", "Fulaninho", 1500, p[0]);
        
        l[0].abrir();
        l[0].folhear(500);
        l[1].abrir();
        l[1].folhear(200);
        
        System.out.println("\n" + l[0].detalhes());
        System.out.println("\n" + l[1].detalhes());
        
        
        
        
    }
    
}
