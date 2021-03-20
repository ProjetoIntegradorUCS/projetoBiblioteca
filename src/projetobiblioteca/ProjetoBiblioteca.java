package projetobiblioteca;

import java.util.Scanner;

public class ProjetoBiblioteca {
    public static void main(String[] args) {
        
        //mockdata para teste de ListaLivros
        Livro livro1 = new Livro("titulo1","editora 1",123,2021,1);
        Livro livro2 = new Livro("abc","abril",345,2019,2);
        Livro livro3 = new Livro("rst","veja",678,2020,3);
        
        ListaLivros listaLivros = new ListaLivros();

        listaLivros.incluirNoFim(livro2);
        listaLivros.incluirNoInicio(livro1);
        listaLivros.incluirNoInicio(livro3);
        
        listaLivros.imprimir();
        
        listaLivros.ordenar();

        listaLivros.imprimir();

        listaLivros.removerDoFim();

        System.out.print(listaLivros.tamanho());

        listaLivros.get(0);

        //fim do teste de ListaLivros

        Autor autor1 = new Autor("nome autor1","brasil");

        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

    }
    
}
