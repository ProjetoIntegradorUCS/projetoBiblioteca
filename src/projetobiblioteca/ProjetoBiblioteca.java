package projetobiblioteca;

import java.util.Scanner;

public class ProjetoBiblioteca {
    public static void main(String[] args) {
        
        //mockdata para teste de ListaLivros
        Livro livro1 = new Livro("titulo1","editora 1",123,2021,1);
        Livro livro2 = new Livro("abc","abril",345,2019,2);
        Livro livro3 = new Livro("rst","veja",678,2020,3);
        Livro livro4 = new Livro("xwy","globo",910,2018,4);
        
        ListaLivros listaLivros = new ListaLivros();

        System.out.print("tamanho da lista: "+listaLivros.tamanho() +" \n");

        System.out.print("incluir No Fim: "); listaLivros.incluirNoFim(livro2); System.out.print("\n");
        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");

        System.out.print("incluir No Inicio: "); listaLivros.incluirNoInicio(livro1); System.out.print("\n");
        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");

        System.out.print("incluir No Inicio: "); listaLivros.incluirNoInicio(livro3); System.out.print("\n");
        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");

        System.out.print("incluir No Fim: "); listaLivros.incluirNoFim(livro4); System.out.print("\n");
        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");

        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");
        
        System.out.print("ordenar: "); listaLivros.ordenar();System.out.print("\n");

        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");

        listaLivros.removerDoFim(); System.out.print("\n");

        System.out.print("imprimir: "); listaLivros.imprimir(); System.out.print("\n");

        System.out.print("tamanho: "); System.out.print(listaLivros.tamanho());

        System.out.print("get: "); listaLivros.get(0);System.out.print("\n");

        //fim do teste de ListaLivros

        Autor autor1 = new Autor("nome autor1","brasil");

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

    }
    
}
