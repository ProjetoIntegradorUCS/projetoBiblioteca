package projetobiblioteca;

import java.util.ArrayList;

public class ListaAutores {

    private static final ArrayList<Autor> listaAutores = new ArrayList<>();
    private static int num;
   
    //método Get
    public static ArrayList<Autor> getListaAutores() {
        return listaAutores;
    }

    //adiciona um objeto na lista
    static public void adicionar(Autor a) throws ExcecaoDeAutoresJaExistente
    {
        try
        {
            for (int i = 0; i < num; i++) 
            {
                if(listaAutores.get(i).equals(a))
                {
                    throw new ListaAutores.ExcecaoDeAutoresJaExistente(" ");
                }
            }
            
        }
        catch(ListaAutores.ExcecaoDeAutoresJaExistente e)
        {
            System.out.println((e + "Lista ja possui autor "+ a.getNome()));
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
    static public boolean remover(String nome) throws ExcecaoDeAutorNaoEncontrado
    {
        try
        {
            for (Autor a : listaAutores) {
                if (a.getNome().equalsIgnoreCase(nome)) {
                    listaAutores.remove(a);
                    return true;                  
                }
                else{
                    throw new ListaAutores.ExcecaoDeAutorNaoEncontrado(" ");
                }
            }
        }
        catch(ListaAutores.ExcecaoDeAutorNaoEncontrado e)
        {
            System.out.println((e + "Autor não encontrado na lista "));
        }
        return false;
    }

    @Override
    public String toString() {
        return listar();
    }

    private static class ExcecaoDeAutoresJaExistente extends Exception {

        public ExcecaoDeAutoresJaExistente(String mensagem) 
        {
            System.out.println(mensagem);       
        }
    }

    private static class ExcecaoDeAutorNaoEncontrado extends Exception {

        public ExcecaoDeAutorNaoEncontrado(String mensagem) 
        {
            System.out.println(mensagem); 
        }
    }

}
