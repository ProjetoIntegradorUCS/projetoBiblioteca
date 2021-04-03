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
public class MenuCadastrar extends Menu {

    private final int MENU_CADASTRAR_LIVRO = 1;
    private final int MENU_CADASTRAR_AUTOR = 2;

    public MenuCadastrar(Menu parent) {
        super("Cadastrar",
              parent);
        super.getOpcoes().
                add(new MenuCadastrarLivro(this));
        super.getOpcoes().
                add(new MenuCadastrarAutor(this));
    }

    @Override
    protected Menu NextMenu(int op) {
        switch (op) {
            case MENU_CADASTRAR_LIVRO: {
                MenuCadastrarLivro m = (MenuCadastrarLivro) super.getOpcoes().
                        get(MENU_CADASTRAR_LIVRO - 1);
                m.CadastrarLivro();
                return this;
            }
            case MENU_CADASTRAR_AUTOR: {
                MenuCadastrarAutor m = (MenuCadastrarAutor) super.getOpcoes().
                        get(MENU_CADASTRAR_AUTOR - 1);
                m.CadastrarAutor();
                return this;
            }
            default:
                return super.getParent();
        }
    }
}
