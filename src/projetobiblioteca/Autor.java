
package projetobiblioteca;

public class Autor {
    private String nome;
    private String pais;

    public Autor(String nome, String pais) {
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
    
    public String imprimir(){
        return "Nome " + nome + "\nPaís: " + pais;
    }
}
