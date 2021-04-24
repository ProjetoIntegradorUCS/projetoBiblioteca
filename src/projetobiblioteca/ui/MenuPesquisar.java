/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import projetobiblioteca.ListaAutores;
import projetobiblioteca.ListaLivros;

/**
 *
 * @author JOAO
 */
public class MenuPesquisar
        extends Menu
{

    private final int MENU_LISTAR_LIVROS = 1;
    private final int MENU_LISTAR_LIVROS_POR_AUTOR = 2;
    private final int MENU_LISTAR_LIVROS_POR_PERIODO = 3;
    private final int MENU_LISTAR_LIVROS_POR_TITULO = 4;

    public MenuPesquisar(Menu parent,
                         ListaLivros ll,
                         ListaAutores la)
    {
        super("Pesquisar",
              parent,
              null,
              null);
        super.getOpcoes().
                add(new MenuListarLivros(this,
                                         ll));
        super.getOpcoes().
                add(new MenuListarLivrosPorAutor(this,
                                                 ll));
        super.getOpcoes().
                add(new MenuListarLivrosPorPeriodo(this,
                                                   ll));
        super.getOpcoes().
                add(new MenuPesquisarTitulo(this,
                                            ll));
    }

    @Override
    protected Menu NextMenu(int op)
    {
        switch (op)
        {
            case MENU_LISTAR_LIVROS:
            {
                return super.getOpcoes().
                        get(MENU_LISTAR_LIVROS - 1);
            }
            case MENU_LISTAR_LIVROS_POR_AUTOR:
            {
                return super.getOpcoes().
                        get(MENU_LISTAR_LIVROS_POR_AUTOR - 1);
            }
            case MENU_LISTAR_LIVROS_POR_PERIODO:
            {
                return super.getOpcoes().
                        get(MENU_LISTAR_LIVROS_POR_PERIODO - 1);
            }
            case MENU_LISTAR_LIVROS_POR_TITULO:
            {
                return super.getOpcoes().
                        get(MENU_LISTAR_LIVROS_POR_TITULO - 1);
            }
            default:
                return super.getParent();
        }
    }
}
