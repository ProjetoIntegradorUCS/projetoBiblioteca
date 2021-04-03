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
public class MenuListarLivros extends Menu {

    public MenuListarLivros(Menu parent) {
        super("Listar Livros",
              parent);
    }

    @Override
    protected void ShowContent() {
        if (ListaLivros.tamanho() > 0) {
            ListaLivros.ordenar();
            ListaLivros.imprimir();
        } else {
            System.out.println("Nenhum Livro Cadastrado!");
        }
    }

}
