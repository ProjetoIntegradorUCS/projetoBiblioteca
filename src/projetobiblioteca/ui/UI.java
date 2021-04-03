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
public class UI {

    private Menu mainMenu;

    public void DisplayMenu() {
        Menu current = mainMenu;
        while (current != null) {
            current = current.Show();
        }
    }

    public UI() {
        this.mainMenu = new MenuPrincipal();
    }

    public Menu getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }

}
