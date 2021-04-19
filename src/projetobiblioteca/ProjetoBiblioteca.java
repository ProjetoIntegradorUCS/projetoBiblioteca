package projetobiblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projetobiblioteca.ListaLivros.ExcecaoDeLivroJaExistente;
import projetobiblioteca.ui.UI;

public class ProjetoBiblioteca {

    public static void main(String[] args) throws ExcecaoDeLivroJaExistente
    {
        Autor autor1 = new Autor("nome autor","brasil");
        Autor autor2 = new Autor("nome autor","brasil");
        
        List<Autor> la = new ArrayList<>();
        la.add(autor1);

        Livro livro1 = new Livro("titulo1","editora 1","123",2021,la);
        Livro livro11 = new Livro("titulo1","editora 1","123",2021,la);
        Livro livro2 = new Livro("abc","abril","345",2019,la);
        Livro livro3 = new Livro("rst","veja","678",2020,la);
        Livro livro4 = new Livro("xwy","globo","910",2018,la);

        ListaLivros listaLivros = new ListaLivros();
        
        System.out.print("incluir No Fim: ");
        listaLivros.incluirNoFim(livro1);
        System.out.print("\n");

        System.out.print("incluir No Fim: ");
        listaLivros.incluirNoInicio(livro2);
        System.out.print("\n");

        System.out.print("imprimir: "); 
        listaLivros.imprimir(); 
        System.out.print("\n");

        System.out.print("incluir No Fim: ");
        listaLivros.incluirNoFim(livro11);
        System.out.print("\n");

        System.out.print("imprimir: "); 
        listaLivros.imprimir(); 
        System.out.print("\n");

        System.out.print("incluir No Fim: ");
        listaLivros.incluirNoFim(livro1);
        System.out.print("\n");

        System.out.print("imprimir: "); 
        listaLivros.imprimir(); 
        System.out.print("\n");

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
    }

}
