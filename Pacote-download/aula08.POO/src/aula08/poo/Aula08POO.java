// Aula 08 - Herança

package aula08.poo;

public class Aula08POO {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Roberta");
        p4.setNome("Carmen");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setIdade(18);
        
        p2.setCurso("TI");
        p3.setSalario(2.500f);
        p4.setSetor("Estoque");
        
        System.out.println("\n" + p1.toString());
        System.out.println("\n" + p2.toString());
        System.out.println("\n" + p3.toString());
        System.out.println("\n" + p4.toString());
        
    }
    
}
