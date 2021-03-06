/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import projetobiblioteca.Autor;
import projetobiblioteca.Excecoes.ExcecaoDeAutoresJaExistente;
import projetobiblioteca.Excecoes.ExcecaoDeLivroJaExistente;
import projetobiblioteca.ListaAutores;
import projetobiblioteca.ListaLivros;
import projetobiblioteca.Livro;

/**
 *
 * @author JOAO
 */
public class MenuCadastrarLivro
        extends Menu
{

    public MenuCadastrarLivro(Menu parent,
                              ListaLivros ll,
                              ListaAutores la)
    {
        super("Cadastrar Livro",
              parent,
              ll,
              la);
    }

    public void CadastrarLivro()
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o Nome do Livro: ");
        String nome = s.nextLine();

        System.out.print("Digite o ISBN do Livro: ");
        String isbn = s.nextLine();

        List<Autor> autores = LerAutor();

        System.out.print("Digite o Nome da Editora: ");
        String editora = s.nextLine();

        int anoPublicacao = LerAno("Digite o Ano da Publicação: ");

        Livro l = new Livro(nome,
                            editora,
                            isbn,
                            anoPublicacao,
                            autores);

        try
        {
            listaLivros.incluirNoFim(l);
        }
        catch (ExcecaoDeLivroJaExistente ex)
        {
            System.out.println(ex);
        }
    }

    private List<Autor> LerAutor()
    {
        Scanner s = new Scanner(System.in);
        boolean addAnotherAutor = true;
        List<Autor> la = new ArrayList<>();
        while (addAnotherAutor)
        {
            System.out.print("Digite o Nome do Autor: ");
            String nomeAutor = s.nextLine();
            System.out.print("Digite o País de Origem do Autor: ");
            String paisAutor = s.nextLine();

            Autor a = new Autor(nomeAutor,
                                paisAutor);
            la.add(a);

            try
            {
                listaAutores.adicionar(a);
            }
            catch (ExcecaoDeAutoresJaExistente ex)
            {
                //Autor já existe. Não precisa ser adicionado novamente.
            }

            System.out.print("Adicionar outro Autor(S/N)? ");
            String outroAutor = s.nextLine();
            if (!outroAutor.toLowerCase().
                    equals("s"))
            {
                addAnotherAutor = false;
            }
        }
        return la;
    }
}
