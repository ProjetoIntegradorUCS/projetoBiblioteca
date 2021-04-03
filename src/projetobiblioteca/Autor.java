package projetobiblioteca;

import java.util.Objects;

public class Autor {

    private String nome;
    private String pais;

    public Autor(String nome,
                 String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String imprimir() {
        return "Nome " + nome + "\nPaís: " + pais;
    }

    @Override
    public String toString() {
        return imprimir();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Autor)) {
            return false;
        }
        Autor a = (Autor) obj;

        return a.getNome().
                toLowerCase().
                equals(this.getNome().
                        toLowerCase())
                && a.getPais().
                        toLowerCase().
                        equals(this.getPais().
                                toLowerCase());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.pais);
        return hash;
    }

}
