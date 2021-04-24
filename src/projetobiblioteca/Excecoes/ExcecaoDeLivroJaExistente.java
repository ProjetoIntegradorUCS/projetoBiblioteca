/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobiblioteca.Excecoes;

public class ExcecaoDeLivroJaExistente
        extends Exception
{

    public ExcecaoDeLivroJaExistente(String mensagem)
    {
        super(mensagem);
    }
}
