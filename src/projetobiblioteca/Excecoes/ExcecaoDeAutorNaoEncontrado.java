/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.Excecoes;

public class ExcecaoDeAutorNaoEncontrado
        extends Exception
{

    public ExcecaoDeAutorNaoEncontrado(String mensagem)
    {
        super(mensagem);
    }
}
