// Aula 09 - Herança (Parte 2)

package aula09.poo;

public class Aula09POO {

    public static void main(String[] args) {
        
        // Pessoa p1 = new Pessoa(); - ERRO!

        Visitante v1 = new Visitante();
        
        v1.setNome("Carla");
        v1.setIdade(25);
        v1.setSexo("F");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("TI");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        
        b1.setNome("Tereza");
        b1.setMatricula(2222);
        b1.setBolsa(12.5f);
        b1.setSexo("F");
        b1.pagarMensalidade();
    }
    
}
