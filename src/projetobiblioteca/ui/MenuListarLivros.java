/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import projetobiblioteca.ListaLivros;

/**
 *
 * @author JOAO
 */
public class MenuListarLivros
        extends Menu
{

    public MenuListarLivros(Menu parent,
                            ListaLivros ll)
    {
        super("Listar Livros",
              parent,
              ll,
              null);
    }

    @Override
    protected void ShowContent()
    {
        if (listaLivros.tamanho() > 0)
        {
            listaLivros.ordenar();
            System.out.println(listaLivros);
        }
        else
        {
            System.out.println("Nenhum Livro Cadastrado!");
        }
    }

}
