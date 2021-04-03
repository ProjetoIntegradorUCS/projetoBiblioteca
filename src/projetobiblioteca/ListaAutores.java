package projetobiblioteca;

import java.util.ArrayList;

public class ListaAutores {

    private static final ArrayList<Autor> listaAutores = new ArrayList<>();

    //método Get
    public static ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    //adiciona um objeto na lista
    static public void adicionar(Autor a) {
        if (!listaAutores.contains(a)) {
            listaAutores.add(a);
        }
    }

    //lista todos os autores da lista
    static public String listar() {
        String saida = "";
        int i = 1;
        for (Autor a : listaAutores) {
            saida += (i++) + "- ";
            saida += a.imprimir() + "\n";
        }
        return saida;
    }

    //remove um autor pelo nome
    static public boolean remover(String nome) {
        for (Autor a : listaAutores) {
            if (a.getNome().
                    equalsIgnoreCase(nome)) {
                listaAutores.remove(a);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return listar();
    }

}
