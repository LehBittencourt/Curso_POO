package aula7.poo;

public class Livro implements Publicacao{
    
    // Atributos 
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    // Construtor
    public Livro(String titulo, String autor, int totalPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

   // Métodos 
    public String detalhes(){
        return "Livro{ " + "\ntitulo = " + titulo + ", \nautor = " + autor + " , "
                + "\ntotal de paginas = " + totalPag + ", \npagina atual = " + pagAtual + ", \naberto = " + aberto + ", "
                + "\nleitor = " + leitor.getNome() + ", \nidade = " + leitor.getIdade() 
                + ", " + "\nsexo = " + leitor.getSexo() + '}';
    }
    
   // Métodos Especiais
   public String getTitulo(){
       return titulo;
   } 
   
   public void setTitulo(String titulo){
       this.titulo = titulo;
   }
   
   public String getAutor(){
       return autor;
   }
   
   public void setAutor(String autor){
       this.autor = autor;
   }
   
   public int getTotalPag(){
       return totalPag;
   }
   
   public void setTotalPag(int totalPag){
       this.totalPag = totalPag;
   }
   
   public int getPagAtual(){
       return pagAtual;
   }
   
   public void setPagAtual(int pagAtual){
       this.pagAtual = pagAtual;
   } 
   
   public boolean getAberto(){
       return aberto;
   }
   
   public void setAberto(boolean aberto){
       this.aberto = aberto;
   }
   
   public Pessoa getLeitor(){
       return leitor;
   }
   
   public void setLeitor(Pessoa leitor){
       this.leitor = leitor;
   }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
       this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
      this.pagAtual--;
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
