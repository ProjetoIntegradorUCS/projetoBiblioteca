package projetobiblioteca;

import projetobiblioteca.ui.UI;

public class ProjetoBiblioteca
{

    public static void main(String[] args)
    {
        ListaLivros ll = new ListaLivros();
        ListaAutores la = new ListaAutores();
        UI ui = new UI(ll,
                       la);
        ui.DisplayMenu();
    }

}
