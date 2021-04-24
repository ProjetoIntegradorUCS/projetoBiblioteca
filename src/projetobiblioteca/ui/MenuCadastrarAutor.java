/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import java.util.Scanner;
import projetobiblioteca.Autor;
import projetobiblioteca.Excecoes.ExcecaoDeAutoresJaExistente;
import projetobiblioteca.ListaAutores;

/**
 *
 * @author JOAO
 */
public class MenuCadastrarAutor
        extends Menu
{

    public MenuCadastrarAutor(Menu parent,
                              ListaAutores la)
    {
        super("Cadastrar Autor",
              parent,
              null,
              la);
    }

    public void CadastrarAutor()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o Nome do Autor: ");
        String nome = s.nextLine();
        System.out.print("Digite o País de Origem do Autor: ");
        String pais = s.nextLine();
        Autor a = new Autor(nome,
                            pais);

        try
        {
            listaAutores.adicionar(a);
        }
        catch (ExcecaoDeAutoresJaExistente ex)
        {
            System.out.println(ex);
        }
    }
}
