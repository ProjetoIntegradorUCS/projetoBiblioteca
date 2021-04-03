package projetobiblioteca;

import java.util.ArrayList;
import java.util.List;

public class ListaLivros {

    private static final int DEFAULT_CAPACITY = 100;
    private static Livro[] listaLivros = new Livro[DEFAULT_CAPACITY]; // lista, posições vazias tem valor null
    private static int capacidade = DEFAULT_CAPACITY; // capacidade da lista
    private static int num = 0; // tamanho atual da lista

    // inclui um Livro no início da lista 
    public static void incluirNoInicio(Livro livro) {
        if (num == capacidade) {
            aumentarCapacidade();
        }

        num++;
        for (int i = num; i > 0; i--) {
            listaLivros[i] = listaLivros[i - 1];
        }
        listaLivros[0] = livro;
    }

    // incluir um Livro no final da lista
    public static void incluirNoFim(Livro livro) {
        if (num == capacidade) {
            aumentarCapacidade();
        }

        listaLivros[num] = livro;
        num++;
    }

    // ordena os objetos Livro presentes na lista em ordem alfabética de título
    public static void ordenar() {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                int contador = listaLivros[j].getTitulo().
                        compareToIgnoreCase(listaLivros[i].getTitulo());

                if (contador > 0) {
                    Livro armazena = new Livro(listaLivros[j].getTitulo(),
                                               listaLivros[j].getEditora(),
                                               listaLivros[j].getIsbn(),
                                               listaLivros[j].getAnoPublicacao(),
                                               listaLivros[j].getListaAutor());
                    contador = 0;
                    listaLivros[j] = listaLivros[i];
                    listaLivros[i] = armazena;
                }
            }
        }
    }

    //imprime a lista de livros por titulo
    public static void imprimir() {
        for (int i = 0; i < num; i++) {
            //System.out.print(i + ". " + listaLivros[i].getTitulo() + ", ");
            System.out.println(listaLivros[i].getTitulo());
        }
    }

    // remove um Livro do final da lista e o retorna
    public static void removerDoFim() {
        if (num == 0) {
            System.out.print("lista esta vazia");
            return;
        }
        System.out.print(
                "livro " + listaLivros[num - 1].getTitulo() + " removido.");
        num--;
        listaLivros[num] = null;
    }

    // retorna a quantidade de livros na lista
    public static int tamanho() {
        return num;
    }

    // retorna o Livro que está na posição da 
    // lista indicada no argumento
    public static void get(int posicao) {
        if (posicao < 0 || posicao >= num) {
            System.out.print("posição não existe dentro da lista");
            return;
        }
        System.out.print(
                "livro " + listaLivros[posicao].getTitulo() + " na posição " + posicao);
    }

    private static void aumentarCapacidade() {
        Livro[] temp = listaLivros.clone();
        capacidade += 50;
        listaLivros = new Livro[capacidade];
        System.arraycopy(temp,
                         0,
                         listaLivros,
                         0,
                         temp.length);
    }

    public static List<Livro> pesquisarAutor(String autor) {
        List<Livro> li = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            for (Autor a : listaLivros[i].getListaAutor()) {
                if (a.getNome().
                        toLowerCase().
                        contains(autor) && !li.contains(listaLivros[i])) {
                    li.add(listaLivros[i]);
                    break;
                }
            }
        }

        return li;
    }

    public static List<Livro> pesquisarPeriodo(int anoInicio,
                                               int anoFim) {
        List<Livro> li = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (listaLivros[i].getAnoPublicacao() >= anoInicio && listaLivros[i].
                    getAnoPublicacao() <= anoFim && !li.contains(listaLivros[i])) {
                li.add(listaLivros[i]);
            }
        }

        return li;
    }

    public static List<Livro> pesquisarTitulo(String expressao) {
        List<Livro> li = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            if (listaLivros[i].getTitulo().
                    toLowerCase().
                    contains(expressao) && !li.contains(listaLivros[i])) {
                li.add(listaLivros[i]);
            }
        }

        return li;
    }
}
