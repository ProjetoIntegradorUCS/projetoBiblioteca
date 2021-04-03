/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

/**
 *
 * @author JOAO
 */
public class MenuPrincipal extends Menu {

    private final int MENU_CADASTRAR = 1;
    private final int MENU_PESQUISAR = 2;

    public MenuPrincipal() {
        super("Principal",
              null);
        super.getOpcoes().
                add(new MenuCadastrar(this));
        super.getOpcoes().
                add(new MenuPesquisar(this));
    }

    @Override
    protected Menu NextMenu(int op) {
        switch (op) {
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
