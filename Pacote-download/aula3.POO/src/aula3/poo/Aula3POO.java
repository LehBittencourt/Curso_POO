// Aula 3 - Exemplo de Métodos Getter, Setter e Construtor:
// Ctrl + i - Cria quaquer um dos métodos automaticamente.
package aula3.poo;

public class Aula3POO {

    public static void main(String[] args) {
        
        /*
                Essa parte da erro por causa do método construtor,
                pois p método construtor pede parâmetros em Caneta
                Para testala o método construtor deve ser apagado
        
        Caneta c1 = new Caneta();  
        
        c1.setModelo("BIC");  // Método Acessor - Getter
        c1.modelo = "BIC";      // Acessando diretamente o atributo
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f; - aqui não da para acessar diretamente, pois o atributo é privado 
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        */        
                
            // Usando Método Construtor:
        
        Caneta c2 = new Caneta("BIC", "Amarelo", 0.4f);
        c2.status();
                
                
                
    }
    
}
