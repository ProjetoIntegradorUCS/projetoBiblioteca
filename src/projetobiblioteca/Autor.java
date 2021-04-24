package projetobiblioteca;

import java.util.Objects;

public class Autor
{

    //cadastro do autor 
    private String nome;
    private String pais;

    //construtor
    public Autor(String nome,
                 String pais)
    {
        this.nome = nome;
        this.pais = pais;
    }

    //getters e setters
    public String getPais()
    {
        return pais;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String imprimir()
    {
        return "Nome: " + nome + "\nPaís: " + pais;
    }

    // annotation @override sobrescreve métodos herdados de java.lang.Objects
    @Override
    public String toString()
    { // "representa" um objeto na forma de string
        return "Nome: " + nome;
    }

    @Override
    public boolean equals(Object obj)
    { //compara objetos
        if (obj == null || !(obj instanceof Autor))
        {
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
    public int hashCode()
    {//retorna código hash
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.pais);
        return hash;
    }
}
