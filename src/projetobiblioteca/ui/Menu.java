/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.ui;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JOAO
 */
public abstract class Menu {

    private Menu parent;
    private List<Menu> opcoes;
    private String title;

    protected List<Menu> getOpcoes() {
        return opcoes;
    }

    protected void setOpcoes(List<Menu> opcoes) {
        this.opcoes = opcoes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Menu(String title,
                Menu parent) {
        this.opcoes = new ArrayList<>();
        this.title = title;
        this.parent = parent;
    }

    public Menu Show() {
        int op;
        ClearScreen();
        System.out.println("Menu " + title + "\n");

        ShowContent();
        System.out.println();
        for (int i = 0; i < opcoes.size(); i++) {
            System.out.println(String.format("%d - %s",
                                             i + 1,
                                             opcoes.get(i)));
        }
        System.out.println(String.format("%d - %s",
                                         opcoes.size() + 1,
                                         (parent == null) ? "Sair" : "Voltar"));
        op = LerOpcao();

        return NextMenu(op);
    }

    protected void ShowContent() {

    }

    protected int LerOpcao() {
        int op = -1;

        while (op < 0) {
            System.out.print("\nOpção: ");
            try {
                Scanner s = new Scanner(System.in);
                op = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro ao ler a opção.");
            }
        }
        return op;
    }

    public static void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public String toString() {
        return title;
    }

    protected Menu NextMenu(int op) {
        return parent;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    protected int LerAno(String mensagem) {
        int ano = -1;

        while (ano < 0 || ano > Calendar.getInstance().
                get(Calendar.YEAR)) {
            System.out.println(mensagem);
            try {
                Scanner s = new Scanner(System.in);
                ano = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro ao ler o ano.");
            }
        }
        return ano;
    }
}
