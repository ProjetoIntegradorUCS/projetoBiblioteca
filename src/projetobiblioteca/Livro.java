package projetobiblioteca;

import java.util.List;
import java.util.Objects;

public class Livro {

    private String titulo;
    private String editora;
    private String isbn;
    private int anoPublicacao;
    private List<Autor> listaAutores;

    public Livro(String titulo,
                 String editora,
                 String isbn,
                 int ano_publicacao,
                 List<Autor> autores) {
        this.titulo = titulo;
        this.editora = editora;
        this.isbn = isbn;
        this.anoPublicacao = ano_publicacao;
        this.listaAutores = autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getListaAutor() {
        return listaAutores;
    }

    public void setListaAutor(List<Autor> listaAutor) {
        this.listaAutores = listaAutor;
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

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String listarAutores() {
        StringBuilder autores = new StringBuilder();
        for (int i = 0; i < listaAutores.size(); i++) {
            autores.append(listaAutores.get(i).
                    getNome());
            if (i + 1 < listaAutores.size()) {
                autores.append(", ");
            }
        }
        return autores.toString();
    }

    public String imprimir() {
        return "Título: " + titulo + "\nEditora: " + editora
                + "\nISBN: " + isbn + "\nAno de publicação: " + anoPublicacao
                + "\nAutores: " + listarAutores();
    }

    @Override
    public String toString() {
        return imprimir();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Livro)) {
            return false;
        }
        Livro l = (Livro) obj;

        boolean _titulo = this.titulo.toLowerCase().
                equals(l.getTitulo().
                        toLowerCase());
        boolean _editora = this.editora.toLowerCase().
                equals(l.getEditora().
                        toLowerCase());
        boolean _isbn = this.isbn.toLowerCase().
                equals(l.getIsbn().
                        toLowerCase());
        boolean _anoPublicacao = this.anoPublicacao == l.getAnoPublicacao();
        boolean autores = this.listaAutores.equals(l.getListaAutor());

        return _titulo && _editora && _isbn && _anoPublicacao && autores;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.editora);
        hash = 89 * hash + Objects.hashCode(this.isbn);
        hash = 89 * hash + this.anoPublicacao;
        hash = 89 * hash + Objects.hashCode(this.listaAutores);
        return hash;
    }

}
