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
public class MenuPesquisarTitulo extends Menu {

    public MenuPesquisarTitulo(Menu parent) {
        super("Pesquisar Titulo",
              parent);
    }

    @Override
    protected void ShowContent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o Termo da Pesquisa: ");
        String pesquisa = s.nextLine();

        System.out.println();
        List<Livro> li = ListaLivros.pesquisarTitulo(pesquisa);

        if (li.size() > 0) {
            li.forEach(l -> {
                System.out.println(imprimeLivro(l));
            });
        } else {
            System.out.println("Nenhum Livro Encontrado!");
        }
    }

    private String imprimeLivro(Livro l) {
        return String.format("Título: %s\nAutores: %s\nEditora: %s",
                             l.getTitulo(),
                             l.getListaAutor(),
                             l.getEditora());
    }

}
