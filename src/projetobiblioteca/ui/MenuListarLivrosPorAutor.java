/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import java.util.List;
import java.util.Scanner;
import projetobiblioteca.ListaLivros;
import projetobiblioteca.Livro;

/**
 *
 * @author JOAO
 */
public class MenuListarLivrosPorAutor
        extends Menu
{

    public MenuListarLivrosPorAutor(Menu parent,
                                    ListaLivros ll)
    {
        super("Listar Livros por Autor",
              parent,
              ll,
              null);
    }

    @Override
    protected void ShowContent()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Nome do Autor: ");
        String nome = s.nextLine();

        System.out.println();
        List<Livro> li = listaLivros.pesquisarAutor(nome);

        if (li.size() > 0)
        {
            li.forEach(l ->
            {
                System.out.println(l);
                System.out.println();
            });
        }
        else
        {
            System.out.println("Nenhum Livro Encontrado!");
        }
    }

}
