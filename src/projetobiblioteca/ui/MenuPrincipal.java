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
public class MenuPrincipal
        extends Menu
{

    private final int MENU_CADASTRAR = 1;
    private final int MENU_PESQUISAR = 2;

    public MenuPrincipal(ListaLivros ll,
                         ListaAutores la)
    {
        super("Principal",
              null,
              null,
              null);
        super.getOpcoes().
                add(new MenuCadastrar(this,
                                      ll,
                                      la));
        super.getOpcoes().
                add(new MenuPesquisar(this,
                                      ll,
                                      null));
    }

    @Override
    protected Menu NextMenu(int op)
    {
        switch (op)
        {
            case MENU_CADASTRAR:
                return super.getOpcoes().
                        get(MENU_CADASTRAR - 1);
            case MENU_PESQUISAR:
                return super.getOpcoes().
                        get(MENU_PESQUISAR - 1);
            default:
                return super.getParent();
        }
    }

}
