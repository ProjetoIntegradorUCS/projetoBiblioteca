package projetobiblioteca;

import projetobiblioteca.Excecoes.ExcecaoDeAutorNaoEncontrado;
import projetobiblioteca.Excecoes.ExcecaoDeAutoresJaExistente;
import java.util.ArrayList;

public class ListaAutores
{

    private final ArrayList<Autor> listaAutores = new ArrayList<>();
    private int num;

    //método Get
    public ArrayList<Autor> getListaAutores()
    {
        return listaAutores;
    }

    //adiciona um objeto na lista
    public void adicionar(Autor a) throws ExcecaoDeAutoresJaExistente
    {
        if (listaAutores.contains(a))
        {
            throw new ExcecaoDeAutoresJaExistente("Lista ja possui autor "
                    + a.getNome());
        }
        else
        {
            listaAutores.add(a);
        }
    }

    //lista todos os autores da lista
    public String listar()
    {
        StringBuilder saida = new StringBuilder();

        for (int i = 0;
             i < listaAutores.size();
             i++)
        {
            saida.append(String.format("%d - %s\n",
                                       i + 1,
                                       listaAutores.get(i)));
        }

        return saida.toString();
    }

    //remove um autor pelo nome
    public void remover(String nome) throws ExcecaoDeAutorNaoEncontrado
    {
        for (Autor a
             : listaAutores)
        {
            if (a.getNome().equalsIgnoreCase(nome))
            {
                listaAutores.remove(a);
                return;
            }
            else
            {
                throw new ExcecaoDeAutorNaoEncontrado(String.format(
                        "Autor %s não encontrado na lista.",
                        nome));
            }
        }
    }

    @Override
    public String toString()
    {
        return listar();
    }

}
