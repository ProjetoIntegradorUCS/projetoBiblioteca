/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import projetobiblioteca.ListaAutores;
import projetobiblioteca.ListaLivros;


public class UI
{

    private Menu mainMenu;
    private ListaLivros listaLivros;

    public void DisplayMenu()
    {
        Menu current = mainMenu;
        while (current != null)
        {
            current = current.Show();
        }
    }

    public UI(ListaLivros ll,
              ListaAutores la)
    {
        this.mainMenu = new MenuPrincipal(ll,
                                          la);
        this.listaLivros = ll;
    }

    public Menu getMainMenu()
    {
        return mainMenu;
    }

    public void setMainMenu(Menu mainMenu)
    {
        this.mainMenu = mainMenu;
    }

    public ListaLivros getListaLivros()
    {
        return listaLivros;
    }

    public void setListaLivros(ListaLivros listaLivros)
    {
        this.listaLivros = listaLivros;
    }

}
