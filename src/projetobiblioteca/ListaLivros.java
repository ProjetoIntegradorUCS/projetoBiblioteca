package projetobiblioteca;
import java.util.ArrayList;
import java.util.Collections;

public class ListaLivros 
{
    private static ArrayList<Livro> listaLivros = new ArrayList<>();    

    // inclui um Livro no início da lista 
    public void incluirNoInicio(Livro livro)
    {
        listaLivros.add(0, livro);
    } 
    
    // incluir um Livro no final da lista
    public void incluirNoFim(Livro livro)
    {
        listaLivros.add(livro);
    }
    
    // ordena os objetos Livro presentes na lista em ordem alfabética de título
    public void ordenar()
    {
        Collections.sort(listaLivros, Livro.LivroTituloComparator);

    }

    //imprime a lista de livros por titulo
    public void imprimir()
    {
        for(int i = 0; i < listaLivros.size(); i++) {   
            System.out.print(listaLivros.get(i).getTitulo().toString()+" ");
        }  
    }

    // remove um Livro do final da lista e o retorna
    public void removerDoFim()
    {
        System.out.print("livro "+listaLivros.get(listaLivros.size()-1).getTitulo().toString()+" removido da lista.");
        listaLivros.remove(listaLivros.size()-1);
    }

    // retorna a quantidade de livros na lista
    public int tamanho()
    {
        int tamanho = listaLivros.size();

        return tamanho;
    }

    // retorna o Livro que está na posição da 
    // lista indicada no argumento
    public void get(int posicao)
    {
        System.out.print("livro "+listaLivros.get(posicao).getTitulo().toString()+" na posição "+posicao);
    }

}
