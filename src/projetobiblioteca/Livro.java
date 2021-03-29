package projetobiblioteca;

public class Livro {
    private String titulo;
    private String editora;
    private int isbn;
    private int ano_publicacao;
    private int id;

    public Livro(String titulo, String editora, int isbn, int ano_publicacao, int id) {
        this.titulo = titulo;
        this.editora = editora;
        this.isbn = isbn;
        this.ano_publicacao = ano_publicacao;
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String imprimir(){
        return "Título: " + titulo + "\nEditora: " + editora +
                "\nISBN: " + isbn + "\nAno de publicação: " + ano_publicacao;
    }
}
    
  
 