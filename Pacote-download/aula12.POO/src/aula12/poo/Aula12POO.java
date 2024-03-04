// Aula 12 - Projeto Final de POO

package aula12.poo;

public class Aula12POO {

    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula de Portugues");
        v[1] = new Video("Aula de Matematica");
        v[2] = new Video("Aula de Fisica");
        
        Aluno a[] = new Aluno[2];
        
        a[0] = new Aluno("Julia", 22, "F" ,"juba");
        a[1] = new Aluno("Berio", 12,"M", "Be");
        
        Visualizacao vis[] = new Visualizacao[5];
        
        vis[0] = new Visualizacao(a[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(a[0], v[1]);
        vis[1].avaliar(0.7f);
        System.out.println(vis[1].toString());
        
        
        
        
        
    }
    
}
