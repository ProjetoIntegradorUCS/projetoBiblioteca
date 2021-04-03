/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import java.util.List;
import projetobiblioteca.ListaLivros;
import projetobiblioteca.Livro;

/**
 *
 * @author JOAO
 */
public class MenuListarLivrosPorPeriodo extends Menu {

    public MenuListarLivrosPorPeriodo(Menu parent) {
        super("Listar Livros por Periodo",
              parent);
    }

    @Override
    protected void ShowContent() {
        int anoInicio = LerAno("Digite o Ano Inicial do Periodo: ");
        int anoFim = LerAno("Digite o Ano Final do Periodo: ");

        System.out.println();
        List<Livro> li = ListaLivros.pesquisarPeriodo(anoInicio,
                                                      anoFim);

        if (li.size() > 0) {
            li.forEach(l -> {
                System.out.println(l.getTitulo());
            });
        } else {
            System.out.println("Nenhum Livro Encontrado!");
        }
    }
}
