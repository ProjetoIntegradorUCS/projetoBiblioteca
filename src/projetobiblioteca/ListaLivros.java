package projetobiblioteca;

public class ListaLivros
{
    private Livro[] listaLivros; // lista, posições vazias tem valor null
    int capacidade; // capacidade da lista
    private int num; // tamanho atual da lista
    static final int DEFAULT_CAPACITY = 100;

    public ListaLivros()
    {
        this(DEFAULT_CAPACITY);
    }

    public ListaLivros(int capacidade)
    {
        this.capacidade = capacidade;
        listaLivros = new Livro[capacidade];
        num = 0;
    }

    // inclui um Livro no início da lista 
    public void incluirNoInicio(Livro livro)
    {
        num++;
        for (int i = num; i > 0; i--)
        {
            listaLivros[i] = listaLivros[i-1]; 
        }
        listaLivros[0] = livro;
    } 
    
    // incluir um Livro no final da lista
    public void incluirNoFim(Livro livro)
    {
        listaLivros[num] = livro;
        num++;
    }
    
    // ordena os objetos Livro presentes na lista em ordem alfabética de título
    public void ordenar()
    {
        
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++)
            {
                int contador = listaLivros[j].getTitulo().toString().compareToIgnoreCase(listaLivros[i].getTitulo().toString());
                

                if (contador > 0)
                {
                    Livro armazena = new Livro(listaLivros[j].getTitulo().toString(),
                                            listaLivros[j].getEditora().toString(),
                                            listaLivros[j].getIsbn(),
                                            listaLivros[j].getAno_publicacao(),
                                            listaLivros[j].getId());
                    contador = 0;
                    listaLivros[j] = listaLivros[i];
                    listaLivros[i] = armazena;
                }
            }
        }
    }

    //imprime a lista de livros por titulo
    public void imprimir()
    {
        for(int i = 0; i < num; i++) 
        {   
            System.out.print(i + " " + listaLivros[i].getTitulo().toString()+" ");
        }  
    }

    // remove um Livro do final da lista e o retorna
    public void removerDoFim()
    {
        if (num == 0) 
        {
            System.out.print("lista esta vazia");
            return;
        }
        System.out.print("livro "+listaLivros[num-1].getTitulo().toString()+" removido.");
        num--;
        listaLivros[num] = null;
    }

    // retorna a quantidade de livros na lista
    public int tamanho()
    {
        return num;
    }

    // retorna o Livro que está na posição da 
    // lista indicada no argumento
    public void get(int posicao)
    {
        if (posicao < 0 || posicao >= num) 
        {
            System.out.print("posição não existe dentro da lista");
            return;
        }
        System.out.print("livro "+listaLivros[posicao].getTitulo().toString()+" na posição "+posicao);
    }

}
