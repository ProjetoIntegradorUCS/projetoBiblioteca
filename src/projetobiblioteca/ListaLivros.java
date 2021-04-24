package projetobiblioteca;

import projetobiblioteca.Excecoes.ExcecaoDeLivroJaExistente;
import projetobiblioteca.Excecoes.ExcecaoDeLivroNaoEncontrado;
import java.util.ArrayList;
import java.util.List;

public class ListaLivros
{

    private final int DEFAULT_CAPACITY = 100; //capacidade default da lista
    private Livro[] listaLivros;// lista, posições vazias tem valor null
    private int capacidade; // capacidade da lista
    private int num; // tamanho atual da lista

    public ListaLivros()
    {
        listaLivros = new Livro[DEFAULT_CAPACITY];
        num = 0;
        capacidade = DEFAULT_CAPACITY;
    }

    // inclui um Livro no início da lista 
    public void incluirNoInicio(Livro livro) throws ExcecaoDeLivroJaExistente
    {

        for (int i = 0;
             i < num;
             i++)
        {
            if (listaLivros[i].equals(livro))
            {
                throw new ExcecaoDeLivroJaExistente(
                        "Lista ja possui livro " + livro.getTitulo());
            }
        }
        if (num == capacidade)
        {
            aumentarCapacidade();
        }

        num++;
        for (int i = num;
             i > 0;
             i--)
        {
            listaLivros[i] = listaLivros[i - 1];
        }
        listaLivros[0] = livro;

    }

    // incluir um Livro no final da lista
    public void incluirNoFim(Livro livro) throws ExcecaoDeLivroJaExistente
    {

        for (int i = 0;
             i < num;
             i++)
        {
            if (listaLivros[i].equals(livro))
            {
                throw new ExcecaoDeLivroJaExistente(
                        "Lista ja possui livro " + livro.getTitulo());
            }
        }

        if (num == capacidade)
        {
            aumentarCapacidade();
        }

        listaLivros[num] = livro;
        num++;

    }

    // ordena os objetos Livro presentes na lista em ordem alfabética de título
    public void ordenar()
    {

        for (int i = 0;
             i < num;
             i++)
        {
            for (int j = 0;
                 j < num;
                 j++)
            {
                int contador = listaLivros[j].getTitulo().
                        compareToIgnoreCase(listaLivros[i].getTitulo());

                if (contador > 0)
                {
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
    public void imprimir()
    {
        for (int i = 0;
             i < num;
             i++)
        {
            //System.out.print(i + ". " + listaLivros[i].getTitulo() + ", ");
            System.out.println(listaLivros[i].getTitulo());
        }
    }

    // remove um Livro do final da lista e o retorna
    public void removerDoFim() throws ExcecaoDeLivroNaoEncontrado
    {
        try
        {
            if (num == 0)
            {
                throw new ExcecaoDeLivroNaoEncontrado(" ");
            }

            System.out.print(
                    "livro " + listaLivros[num - 1].getTitulo() + " removido.");
            num--;
            listaLivros[num] = null;
        }
        catch (ExcecaoDeLivroNaoEncontrado e)
        {
            System.out.println((e + "Livro não encontrado na lista "));
        }

    }

    // retorna a quantidade de livros na lista
    public int tamanho()
    {
        return num;
    }

    // retorna o Livro que está na posição da 
    // lista indicada no argumento
    public void get(int posicao)
    {
        if (posicao < 0 || posicao >= num)
        {
            System.out.print("posição não existe dentro da lista");
            return;
        }
        System.out.print(
                "livro " + listaLivros[posicao].getTitulo() + " na posição " + posicao);
    }

    //aumenta capacidade da lista
    private void aumentarCapacidade()
    {
        Livro[] temp = listaLivros.clone();
        capacidade += 50;
        listaLivros = new Livro[capacidade];
        System.arraycopy(temp,
                         0,
                         listaLivros,
                         0,
                         temp.length);
    }

    public List<Livro> pesquisarAutor(String autor)
    {
        List<Livro> li = new ArrayList<>();

        for (int i = 0;
             i < num;
             i++)
        {
            for (Autor a
                 : listaLivros[i].getListaAutor())
            {
                if (a.getNome().
                        toLowerCase().
                        contains(autor) && !li.contains(listaLivros[i]))
                {
                    li.add(listaLivros[i]);
                    break;
                }
            }
        }

        return li;
    }

    public List<Livro> pesquisarPeriodo(int anoInicio,
                                        int anoFim)
    {
        List<Livro> li = new ArrayList<>();

        for (int i = 0;
             i < num;
             i++)
        {
            if (listaLivros[i].getAnoPublicacao() >= anoInicio && listaLivros[i].
                    getAnoPublicacao() <= anoFim && !li.contains(listaLivros[i]))
            {
                li.add(listaLivros[i]);
            }
        }

        return li;
    }

    public List<Livro> pesquisarTitulo(String expressao)
    {
        List<Livro> li = new ArrayList<>();

        for (int i = 0;
             i < num;
             i++)
        {
            if (listaLivros[i].getTitulo().
                    toLowerCase().
                    contains(expressao) && !li.contains(listaLivros[i]))
            {
                li.add(listaLivros[i]);
            }
        }

        return li;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;
             i < num;
             i++)
        {
            sb.append(String.format("%d - %s\n",
                                    i + 1,
                                    listaLivros[i]));
        }

        return sb.toString();
    }

}
